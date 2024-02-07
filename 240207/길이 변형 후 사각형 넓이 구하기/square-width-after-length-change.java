import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 입력받기
        int a = sc.nextInt(); // 가로 
        int b = sc.nextInt(); // 세로

        // 변수 선언  
        a += 8;
        b *= 3;

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(a * b);
    }
}