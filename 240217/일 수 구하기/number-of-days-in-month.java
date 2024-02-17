import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();

        // 출력
        // 윤년이 아닌 해의 2월은 28일까지만 존재
        if (n == 2) {
            System.out.println(28);
        }
        // 1, 3, 5, 7월은 31일까지 존재
        else if (n % 2 == 1 && n <= 7) {
            System.out.println(31);
        }
        // 8, 10월도 31일까지 존재
        else if (n % 2 == 0 && n >= 8) {
            System.out.println(31);
        }
        // 4, 6월은 30일까지 존재
        else if (n % 2 == 0 && n >= 4) {
            System.out.println(30);
        }
        // 그외의 경우 30일까지 존재
        else {
            System.out.println(30);
        }
    }
}