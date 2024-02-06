import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        String a = sc.next();
        String b = sc.next();
        String temp;

        // 바꾸기
        temp = a;
        a = b;
        b = temp;

        // 출력
        System.out.println(a);
        System.out.println(b);
    }
}