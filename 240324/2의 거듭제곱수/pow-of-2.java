import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();
        int x = 0;

        // 조건을 만족하는 x값 구하기
        while (n != 1) {
            if(n % 2 == 0) n /= 2;
            else {
                continue;
            }
            x++;
        }
        System.out.println(x);
    }
}