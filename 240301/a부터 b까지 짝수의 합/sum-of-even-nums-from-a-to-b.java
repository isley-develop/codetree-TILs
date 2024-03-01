import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        int sum = 0;

        // a부터 b까지 짝수의 합 

        for(int i = a; i <= b; i++) {
            if(i % 2 == 0)
                sum += i;
        }

        // 출력
        System.out.println(sum);
    }
}