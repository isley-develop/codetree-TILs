import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        // 변수 선언 및 입력
        int temp;
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 위치 변경
        temp = x;
        x = y;
        y = temp;

        // 출력
        System.out.println("0" + a + "-" + x + "-" + y);
    }
}