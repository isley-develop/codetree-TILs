import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int m = sc.nextInt();

        // 출력
        if (m <= 12 && m <= 2) {
            System.out.println("Winter");
        }
        else if (m <= 5) {
            System.out.println("Summer");
        }
        else if (m <= 8) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }                
    }
}