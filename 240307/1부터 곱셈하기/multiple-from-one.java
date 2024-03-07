import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();
        int a = 1;

        // 1부터 차례대로 10까지 1씩 증가시키며 곱 구하기
        for (int i = 1; i <= 10; i++) {
            a *= i;
            // n 이상이 되는 순간 곱해진 숫자 출력
            if (a >= n) {
                System.out.print(i);
                break;
            }
        }   
    }
}