import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a = 0;
        int cnt = 0;

        // 짝수가 등장한 횟수
        for (int i = 1; i <= 5; i++) {
            // 한줄에 하나씩 주어지는 숫자 입력받기
            a = sc.nextInt();

            if (i % 2 == 0) {
                cnt ++;
            }
        }
        
        // 출력
        System.out.println(cnt);
    }
}