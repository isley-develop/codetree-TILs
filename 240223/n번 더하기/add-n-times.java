import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int n = sc.nextInt();

        // 출력
        for (int i = 1; i <= n; i++) {
            System.out.println(a + (n * i));
        }
    }
}