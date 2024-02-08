import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		    int h = sc.nextInt();
		    int w = sc.nextInt();

		    int bmi = w*10000 / (h * h);

            if (bmi >= 25) {
                System.out.println(bmi);
                System.out.println("Obesity");
            }
            else if (bmi < 25) {
                System.out.println("pass");
            }
    }
}