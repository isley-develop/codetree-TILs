import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 출력
        for (int i = a; i <= b;) {
            System.out.print(i + " ");

            if (i % 2 == 0) {
                i += 3;
            }
            else {
                i *= 2;
            }
        }
    }
}