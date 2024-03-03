import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;

        // 1부터 b까지의 수 중 a의 배수들의 곱 구하기
        for(int i = 1; i <= b; i++) {
            if (i % a == 0) {
                prod *= i;
            }
        }

        // 출력
        System.out.print(prod);
    }
}