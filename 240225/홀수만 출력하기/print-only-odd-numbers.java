import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();

        // 출력
        for (int i = 1; i <= 10;) {
            if (i % 3 == 0 && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}