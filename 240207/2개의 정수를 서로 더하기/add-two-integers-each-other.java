import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수
        int a = sc.nextInt();
        int b = sc.nextInt();

        // b를 a에 더하기
        a += b;
        // 출력
        System.out.print(a);

        // a를 b에 더하기
        b += a;
        // 출력
        System.out.println(" " + b);
    }
}