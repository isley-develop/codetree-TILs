import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 10개 입력받을 배열 생성
        int arr[] = new int[10];

        // 변수 선언
        int sum = 0, cnt = 0;

        // 배열에 정수 입력받기, 입력받은 정수의 합 구하기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                break;

            cnt ++;
            sum += arr[i];
        }

        // 평균 구하기
        double avg = (double)sum / cnt;

        // 합과 평균
        System.out.printf("%d %.1f", sum, avg);
    }
}