import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        int cnt = 0;

        // 출력
        while (true) {
            // 정수 입력받기
            n = sc.nextInt();

            // 짝수면 2로 나눈 몫을 출력
            if (n % 2 == 0) {
                cnt++;
                System.out.println(n / 2);
            }

            if (cnt >= 3)
                break;
        }
    }
}