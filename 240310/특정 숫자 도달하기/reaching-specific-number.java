import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 만든 뒤 초기값 설정
        int[] arr = new int[10];

        // 합계, 평균 변수 선언
        int sum = 0;
        double avg = 0;

        // 250이상의 정수가 주어진 경우 합을 구한다 
        // 마지막으로 주어진 수는 제외한다
        for (int i = 0; i <= 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
        }

        // 평균 구하기
        avg = (double) sum / 5;

        // 합과 평균 출력하기
        System.out.printf("%d %.1f", sum, avg);
    }
}