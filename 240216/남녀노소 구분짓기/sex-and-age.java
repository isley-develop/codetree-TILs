import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int g = sc.nextInt();
        int a = sc.nextInt();

        // 출력
        if (g == 1) {
            if (a >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }
        else {
            if (a >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
    }
}