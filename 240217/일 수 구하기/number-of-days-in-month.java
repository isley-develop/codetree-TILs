import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();

        // 출력
        if (n != 2) {
            if (n % 2 == 0 && n == 8) {
                System.out.println(30);
            }
            else {
                System.out.println(31);
            }
        }
        else {
            System.out.println(28);
        }
    }
}