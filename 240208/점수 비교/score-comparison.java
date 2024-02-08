import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a_math = sc.nextInt();
        double a_eng = sc.nextInt();
        double b_math = sc.nextInt();
        double b_eng = sc.nextInt();

        if (a_math>b_math && a_eng>b_eng){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}