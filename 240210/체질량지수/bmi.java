import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키
        int h_cm = sc.nextInt();
        double h_m;
        h_m = h_cm / 100.0;

        // 몸무게
        int w = sc.nextInt(); 

        double bmi;
        bmi = w / (h_m * h_m);

        System.out.println((int)bmi);

        if (bmi >= 25) {
            System.out.println("Obesity");
        }
    }
}