import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int sum = 0;

        // 정수 10개 입력받을 배열 생성
        int[] arr = new int[10];

        // 정수 10개 입력받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 3번째, 5번째, 10번째 정수의 합 구하기
        sum = arr[2] + arr[4] + arr[9]; 

        // 정수의 합 출력
        System.out.println(sum);
    }
}