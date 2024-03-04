import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // 변수 선언, 입력
       int n = sc.nextInt();
       int cnt = 0;
       
       // 친근한 수
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
                continue;
            cnt++;
        }
        
        // 출력
        System.out.println(cnt);
    }
}