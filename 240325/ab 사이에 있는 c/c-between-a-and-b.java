import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // boolean type 변수 선언
        boolean Yes = false;
        
        // 조건문
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                Yes = true;
            }
        }

        // 조건 만족 시 YES 또는 NO 출력
        if (Yes == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}