import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();
        boolean satisfied = false;

        // 조건
        for (int i = 1; i <= n; i++) {
            if (i % 1 == 0) {
                if (i % n == 0) 
                    satisfied = true;
            }
        }

        // 출력
        if (satisfied == true) {
            System.out.println("P");
        }
        else {
            System.out.println("C");
        }
    }
}