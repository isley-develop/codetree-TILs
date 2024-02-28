import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = 0;
        int sumVal = 0;

        // 홀수이면서 3의 배수인 수들의 합 구하기
        for (int i = 1; i <= 6; i++) {
            n = sc.nextInt();

            if (n % 2 == 1 && n % 3 == 0) {
                sumVal += n;
            }
        }
        
        // 출력
        System.out.println(sumVal);
    }
}