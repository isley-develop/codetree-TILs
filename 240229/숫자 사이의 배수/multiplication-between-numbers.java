import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0, count = 0;
        double avg = 0;

        // a부터 b까지의 수 중 5 또는 7의 배수들의 합
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                avg += i;
                count ++;
            }
        }
        
        // 합과 평균 출력
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg / count);
    }
}