import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 출력
        System.out.printf("%d %.1f", (a + b), (double)(a + b) / 2);
    }
}