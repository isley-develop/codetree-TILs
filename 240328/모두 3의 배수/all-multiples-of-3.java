import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        boolean satisfied = true;

        // 조건
        for(int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            
            if(n % 3 != 0) {
                satisfied = false;
            }
        }
        
        //출력
        if(satisfied == true)
            System.out.println(1);
        else
            System.out.println(0);
    }
}