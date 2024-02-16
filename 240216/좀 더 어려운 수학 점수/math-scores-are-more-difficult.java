import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();

        // 출력
        // 영어 점수와 상관없이 수학 점수가 높은 경우
        if (a_math > b_math) {
            System.out.println("A");
        }
        else if (b_math > a_math) {
            System.out.println("B");
        }
        // 수학 점수 같을 때 영어 점수가 더 높은 경우
        else if ((a_math == b_math) && (a_eng > b_eng)) {
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }
    }
}