import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        // a이상 b이하 수 중 6의 배수이면서, 8의 배수가 아닌 수
        for (int i = a; i <= b; i++) {
            if (i % 6 == 0 && i % 8 != 0) {
                sum += i;        
            }
        }

        // 출력
        System.out.print(sum);
    }
}