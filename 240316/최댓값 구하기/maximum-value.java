import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max_val = a;

        if(b>max_val) max_val = b;

        if(c>max_val) max_val = c;

        System.out.println(max_val);
    }
}