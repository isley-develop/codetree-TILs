import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n = sc.nextInt();
        boolean satisfied = true;

        for (int i = 2; i <= (n - 1) ; i++) {
            if(n % i == 0) {
                satisfied == false;
            }
        }
        
        //출력
        if(satisfied == true)
            System.out.println("P");
        else
            System.out.println("C");
    }
}