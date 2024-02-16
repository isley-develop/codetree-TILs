import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a1 = sc.nextInt();
        char g1 = sc.next().charAt(0);
        int a2 = sc.nextInt();
        char g2 = sc.next().charAt(0);

        // 출력
        if ((a1 >= 19 && g1 == 'M') || (a2 >= 19 && g2 == 'M')) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}