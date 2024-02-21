import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        
        // 출력
        while (i <= b) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}