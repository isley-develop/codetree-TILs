import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언, 초기화
        int a = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        // 입력
        for(int i = 1; i <= 10; i++) {
            a = sc.nextInt();

            if(a % 3 == 0)
                cnt1++;
            if(a % 5 == 0)
                cnt2++;                
        }

        // 출력
        System.out.print(cnt1 + " " + cnt2);
    }
}