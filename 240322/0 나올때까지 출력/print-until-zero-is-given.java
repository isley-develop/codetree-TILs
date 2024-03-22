import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;

        // 출력
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(n);
        }
    }
}