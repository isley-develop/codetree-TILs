import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언, 입력
        int n = sc.nextInt();

        // 출력
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}