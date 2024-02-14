import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // 출력
        if (1.0 <= a && 1.0 <= b) {
            System.out.println("High");
        }
        else if (0.5 <= a && 0.5 <= b) {
            System.out.println("Middle");
        }
        else {
            System.out.println("Low");
        }
    }
}