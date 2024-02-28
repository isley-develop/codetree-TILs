import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int sumVal = 0;
        double avgVal = 0;

        // a부터 b까지의 합 구하기
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal += i;
                avgVal += i;
                count ++;
            }
        }
        
        // 출력
        System.out.print(sumVal + " ");
        System.out.printf("%.1f", avgVal / count);
    }
}