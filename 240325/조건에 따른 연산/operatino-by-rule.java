import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        int cnt = 0;

        // n이 1000 이상이 될 때까지 짝수/홀수 여부에 따라 계산
        while(n <= 1000) {
            if(n % 2 == 0) {
                n = n * 3 + 1;
            }

            else {
                n = n * 2 + 2;
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}