import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        char sym1 = sc.next().charAt(0);
        int temp1 = sc.nextInt();

        char sym2 = sc.next().charAt(0);
        int temp2 = sc.nextInt();

        char sym3 = sc.next().charAt(0);
        int temp3 = sc.nextInt();

        
        if (sym1 == 'Y') {
            if (temp1 >= 37) {
            cnt ++;
            }
        }
        if (sym2 == 'Y') {
            if (temp2 >= 37) {
            cnt ++;
            }
        }
        if (sym3 == 'Y') {
            if (temp3 >= 37) {
            cnt ++;
            }
        }
        
        if (cnt >= 2) {
            System.out.print('E');
        }
        else {
            System.out.print('N');
        }
    }
}