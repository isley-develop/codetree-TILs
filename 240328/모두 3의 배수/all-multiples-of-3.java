import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        int cnt = 0;

        // 조건
        for(int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            
            if(n % 3 == 0) {
                cnt++;
            }
        }
        
        //출력
        if(cnt == 5)
            System.out.println(1);
        else
            System.out.println(0);
    }
}