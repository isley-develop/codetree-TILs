import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 출력
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = b; i >= a; i--) {
                System.out.print(i + " ");
            }
        }
    }
}