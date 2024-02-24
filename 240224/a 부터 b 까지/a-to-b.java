import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 출력
        for (int i = 1; i < b;) {
            if (i % 2 == 1 && i < b) {
                i *= 2;
                System.out.print(i + " ");
            }
            else if (i % 2 == 0 && i < b) {
                i += 3;
                System.out.print(i + " ");
            }
        } 
    }
}