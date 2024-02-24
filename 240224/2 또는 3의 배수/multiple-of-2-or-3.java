import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();

        // 출력
        for (int i = 1; i <= n; i++) {
            if (i % 6 == 0) {
                System.out.print(1 + " ");
            }
            else if (i % 2 == 0) {
                System.out.print(1 + " ");
            }
            else if (i % 3 == 0) {
                System.out.print(1 + " ");
            }
            else {
                System.out.print(0 + " ");
            }
        }
    }
}