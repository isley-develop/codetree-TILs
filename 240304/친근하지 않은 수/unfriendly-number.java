import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // 변수 선언, 입력
       int n = sc.nextInt();
       int cnt = 0;
       
       // 친근한 수
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            else if (i % 3 == 0) {
                continue;
            }
            else if (i % 5 == 0) {
                continue;
            }
            // 친근하지 않은 수의 개수
            cnt++;
        }
        // 출력
        System.out.println(cnt);
    }
}