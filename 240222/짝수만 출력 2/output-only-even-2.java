import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int b = sc.nextInt();
        int a = sc.nextInt();
        int i = b;

        // 출력
        while (i >= a) {
            System.out.print(i + " ");
            i -= 2;
        } 
    }
}