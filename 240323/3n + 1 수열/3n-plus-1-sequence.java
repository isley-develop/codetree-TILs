import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();
        int cnt = 0;

        while (true) {

            // n이 1일 때 중단
            if (n == 1) {
                System.out.println(cnt);
                break;
            }
            // n이 짝수일 때
            if (n % 2 == 0) {
                n = n / 2;
                cnt++;
            }
            // n이 홀수일 때
            else {
                n = (n * 3) + 1;
                cnt++;
            }
        }
    }
}