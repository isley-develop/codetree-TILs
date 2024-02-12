import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt(); // 가진 돈

        // 출력
        if (n == 3000) {
            System.out.println("book");
        }
        else if (n == 1000) {
            System.out.println("mask");
        }
        else {
            System.out.println("no");
        }
    }
}