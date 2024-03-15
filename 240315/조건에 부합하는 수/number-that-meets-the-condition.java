import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a = sc.nextInt();

        // 1부터 a까지의 수 중 다음 조건을 모두 만족하지 않는 수
        for (int i = 1; i <= a; i++) {
            int c = i / 8;
            if (i % 2 == 0 && i % 4 != 0)
                continue;
            if (c % 2 == 0)
                continue;
            if ((i % 7) < 4)
                continue;

            // 출력
            System.out.print(i + " ");
        }
    }
}