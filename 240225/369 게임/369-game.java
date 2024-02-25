import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();

        // 출력
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                System.out.print("0 ");
            }
            else if (i % 10 == 3) {
                System.out.print("0 ");
            }
            else if (i % 10 == 6) {
                System.out.print("0 ");
            }
            else if (i % 10 == 9) {
                System.out.print("0 ");
            }
            else if (i / 30 == 1 && i <= 39) {
                System.out.print("0 ");
            }
            else if (i / 60 == 1 && i <= 69) {
                System.out.print("0 ");
            }
            else if (i / 90 == 1 && i <= 99) {
                System.out.print("0 ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}