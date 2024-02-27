import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n = sc.nextInt();
        int cnt2 = 0, cnt3 = 0, cnt12 = 0;
        // cnt2 교실, cnt3 복도, cnt12 화장실

        // 입력
        for(int i = 1; i <= n; i++) {

            if(i % 12 == 0)
                cnt12++;
            else if(i % 3 == 0)
                cnt3++;
            else if(i % 2 == 0)
                cnt2++;
        }

        // 출력
        System.out.print(cnt2 + " " + cnt3 + " " + cnt12);
    }
}