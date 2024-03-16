import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 조건에 맞는 결과 출력
        if (a >= b && a > c) {
            System.out.print(a);
        }
        else if (b >= a && b > c) {
            System.out.print(b);
        }
        else if (c >= b && c > a) {
            System.out.print(c);
        }
    }
}