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

        // 출력 - 삼항연산자 이용
        System.out.println(b < a ? 1 : 0);
        System.out.println(c < a ? 1 : 0);
        System.out.println(d < a ? 1 : 0);
        System.out.println(e < a ? 1 : 0);        
    }
}