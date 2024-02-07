import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 연산
        a += 87;
        b %= 10;

        // 출력
        System.out.println(a);
        System.out.println(b);
    }
}