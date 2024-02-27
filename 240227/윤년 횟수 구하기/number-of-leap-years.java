import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int n = sc.nextInt();
        int cnt = 0;

        // 1년부터 n년까지 윤년은 총 몇 번 있었는가?
        for (int i = 1; i <= n; i ++) {
    
            if (i % 100 == 0 && i % 400 != 0) {
            }
            else if (i % 4 == 0) {
                cnt ++;
            }
        }

        // 출력
        System.out.print(cnt);
    }
}