import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        // 출력
        if (b < a) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        if (c < a) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        if (d < a) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        if (e < a) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }                
    }
}