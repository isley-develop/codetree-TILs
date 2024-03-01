import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n = sc.nextInt();
        int sum = 0;

        // n의 약수 구하기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // 출력
        // 전체 약수 합 - 자기 자신 = 완전수
        if (n == sum - n) {
            System.out.println("P");
        }
        else {
            System.out.println("N");
        }
    }
}