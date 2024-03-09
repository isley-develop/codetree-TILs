import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int val; 
        int sum = 0; 

        // 주어진 10개 원소의 합
        for (int i = 0; i < 10; i++) {
            val = sc.nextInt();
            sum += val;
        }

        // 출력
        System.out.print(sum);
    }
}