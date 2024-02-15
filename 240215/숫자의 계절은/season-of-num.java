import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int m = sc.nextInt();

        // 출력
        if (3 <= m && m <= 5) {
            System.out.println("Spring");
        }
        else if (6 <= m && m <= 8) {
            System.out.println("Summer");
        }
        else if (9 <= m && m <= 11) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }                
    }
}