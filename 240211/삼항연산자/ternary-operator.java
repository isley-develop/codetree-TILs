import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int score = sc.nextInt();

        // 출력
        System.out.println(score == 100 ? "pass" : "failure");
    }
}