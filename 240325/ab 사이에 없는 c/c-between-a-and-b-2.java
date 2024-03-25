import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 조건
        boolean satisfied = true;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                satisfied = false;
            }
        }

        // 출력
        if (satisfied == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}