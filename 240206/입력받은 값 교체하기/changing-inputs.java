import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int a, b;
        int temp;

        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 위치 교환
        temp a;
        a = b;
        b = temp;

        // 출력
        System.out.println(a + " " + b);
    }
}