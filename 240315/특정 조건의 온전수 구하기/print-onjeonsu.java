import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();

        // 온전수의 조건
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                continue;
            if (i % 10 == 5)
                continue;
            if (i % 3 == 0 && i % 9 != 0)
                continue;

            // 온전수 출력
            System.out.print(i + " ");
        }
    }
}