import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();
        int cnt = 0;

        // 1 이하가 되는 순간까지 나눗셈을 진행한 총 횟수를 구하기
        for (int i = 1; i <= 100; i++) {
            n =  n / i;
            cnt ++;
            if (n <= 1) {
                break;
            }
        }
        System.out.print(cnt);
    }
}