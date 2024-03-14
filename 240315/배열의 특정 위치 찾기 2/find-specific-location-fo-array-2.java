import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개 문자 입력받을 배열 생성
        int[] arr = new int[10];

        // 변수 선언
        int sum1 = 0, sum2 = 0;

        // 정수 입력받아 배열에 저장
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 짝수 번째, 홀수 번째 입력받은 정수의 합
        for (int i = 0; i < 10; i ++){
            if (i % 2 == 0)
                sum1 += arr[i];
            else
                sum2 += arr[i];
        }

        // 큰 수에서 작은 수를 뺀 값을 출력
        if (sum1 > sum2) {
            System.out.print(sum1 - sum2);
        }
        else {
            System.out.print(sum2 - sum1);
        }
    }
}