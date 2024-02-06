import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        
        // 변수 선언 및 입력
        int l = sc.nextInt();
        int r = sc.nextInt();

        // 출력
        System.out.print(l);
        System.out.print(r);

    }
}