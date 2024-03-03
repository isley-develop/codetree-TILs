import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;

        // a의 b승 구하기
        for(int i = 1; i <= b; i++) {
            prod *= a;
        }

        // 출력
        System.out.print(prod);
    }
}