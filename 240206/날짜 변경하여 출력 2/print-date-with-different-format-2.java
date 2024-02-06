import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // - 를 기준으로 값을 잘라 입력받기
        sc.useDelimiter("-");

        // 변수 선언 및 입력
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int yyyy = sc.nextInt();

        // 출력
        System.out.println(yyyy + "." + mm + "." + dd);  
    }
}