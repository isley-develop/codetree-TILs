import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // 출력
        if (a <= b && a <= c) {
            System.out.print("1");
        }
        else {System.out.print("0");}

        System.out.print(" ");

        if (a == b && a == c) {
            System.out.print("1");
        }
        else {System.out.print("0");}
    }
}