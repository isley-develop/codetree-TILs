import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();

        // boolean type 변수 선언
        boolean satisfied = false;

        // 조건문
        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                satisfied = true;
            }
        }

        // 조건 만족 시 C 출력
        if (satisfied == true) {
            System.out.println("C");
        }
        else {
            System.out.println("N");
        }
    }
}