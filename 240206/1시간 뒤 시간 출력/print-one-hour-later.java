import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");

        // 변수 선언 및 입력
        int h = sc.nextInt() + 1;
        int m = sc.nextInt(); 

        // 출력
        System.out.println(h + ":" + m);
    }
}