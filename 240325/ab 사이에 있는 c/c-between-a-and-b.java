import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // boolean type 변수의 초기값으로는 false를 둔다
        boolean Yes = false;
        for (int i = a; i <= b; i++) {
            if (i % a == 0 || i % b == 0) {
                Yes = true;
            }
        }

        // 조건을 만족하는 경우
        if (Yes == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}