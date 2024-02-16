import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int y = sc.nextInt();

        // 출력
        // 400의 배수라면 윤년이다
        if (y % 400 == 0) {
            System.out.println("true");
        }
        // 100의 배수이면서 4의 배수이면 윤년이 아니다 
        else if (y % 100 == 0) {
            System.out.println("false");
        }
        // 4의 배수라면 윤년이다
        else if (y % 4 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}