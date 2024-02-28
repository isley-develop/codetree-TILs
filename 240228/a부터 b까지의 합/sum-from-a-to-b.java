import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumVal = 0;

        // a부터 b까지의 합 구하기
        for (int i = a; i <= b; i++) {
            sumVal += i;
        }
        
        // 출력
        System.out.println(sumVal);
    }
}