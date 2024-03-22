import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;

        // 출력
        while (true) {
            n = sc.nextInt();
            if (n < 25) {
                System.out.println("Higher");
            }
            else if (n > 25) {
                System.out.println("Lower");
            }
            else {
                System.out.println("Good");
                break;
            }
        }
    }
}