import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();

        // 출력
        if (a % 2 == 0) {
            System.out.println(a / 2);
        }
        if (a % 2 != 0) {
            System.out.println((a + 1) / 2);
        }
    }
}