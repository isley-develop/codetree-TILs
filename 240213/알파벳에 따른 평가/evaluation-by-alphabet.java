import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        char e = sc.next().charAt(0);

        // 출력
        if (e == 'S') {
            System.out.println("Superior");
        }
        else if (e == 'A') {
            System.out.println("Excellent");
        }
        else if (e == 'B') {
            System.out.println("Good");
        }
        else if (e == 'C') {
            System.out.println("Usually");
        }
        else if (e == 'D') {
            System.out.println("Effort");
        }
        else {
            System.out.println("Failure");
        }
    }
}