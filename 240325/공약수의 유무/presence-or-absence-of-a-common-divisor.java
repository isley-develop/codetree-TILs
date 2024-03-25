import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a = sc.nextInt();
        int b = sc.nextInt();

        // boolean type 변수 선언
        boolean satisfied = false;

        // 조건문
        for (int i = a; i <= b; i++) {
            if (1920 % i == 2880 % i) {
                satisfied = true;
            }
        }

        // 조건 만족 시 1 출력
        if (satisfied == true) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}