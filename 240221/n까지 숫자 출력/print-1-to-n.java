import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자연수 n 입력 받기
        int n = sc.nextInt();

        // 변수 i 초기화
        int i = 1;
        
        // while문 사용
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}