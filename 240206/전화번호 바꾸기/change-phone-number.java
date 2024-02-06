import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 출력
        System.out.printf("%03d-%d-%d", a, y, x);
    }
}