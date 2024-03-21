import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int cnt = 0;

        // 증상 여부, 체온 입력받기
        char sym1 = sc.next().charAt(0);
        int temp1 = sc.nextInt();

        char sym2 = sc.next().charAt(0);
        int temp2 = sc.nextInt();

        char sym3 = sc.next().charAt(0);
        int temp3 = sc.nextInt();

        // A 조건에 해당하는 사람
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
        
        // 출력
        if (cnt >= 2) {
            System.out.print('E');
        }
        else {
            System.out.print('N');
        }
    }
}