import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int h = sc.nextInt(); // 키
        int w = sc.nextInt(); // 몸무게
        int bmi;

        bmi = (w * 10000 / (h * h));

        if (bmi >= 25) {
            System.out.println(bmi);
            System.out.println("Obesity");
        }
    }
}