import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int y = sc.nextInt();

        // 출력
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}