import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        // a와 b사이의 수 중 5의 배수들의 합
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        for (int i = b; i <= a; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }       
        
        // 합 출력
        System.out.print(sum);
    }
}