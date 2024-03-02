import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n = sc.nextInt();
        int sum = 0, cnt = 0;
        double avg;

        // n개의 정수 입력받아 합계 구하기
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();

            sum += a;
            cnt ++;
        }

        // 평균 구하기
        avg = (double)sum / cnt;

        // 출력
        System.out.printf("%d %.1f", sum, avg);
    }
}