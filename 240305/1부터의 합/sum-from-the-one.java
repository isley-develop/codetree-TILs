import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();
        int sum = 0, cnt = 0;

        // 1부터 차례대로 100까지 1씩 증가시키며 합 구하다가
        for (int i = 1; i <= 100; i++) {
            sum += i;
            cnt = i;
            // 처음으로 그 합이 n 이상이 되는 순간 스탑
            if (sum >= n) {
                break;
            }
        }

        // 출력
        System.out.println(cnt);
    }
}