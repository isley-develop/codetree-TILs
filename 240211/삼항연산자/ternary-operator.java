import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        int level;

        if (score >= 100) {
            level = 0;
            System.out.println("pass");
        }
        else {
            level = 1;
            System.out.println("failure");
        }
    }
}