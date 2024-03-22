import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int cnt = 0;

        // 증상 여부, 체온 입력받기
        char sym[]= new char[6];
        int temp[] = new int [6];


        for (int i = 0; i < 6; i++) {
            if(i % 2 == 0) {
                sym[i] = sc.next().charAt(0);
            }
            else {
                temp[i] = sc.nextInt();
            }
        }

        // A 조건에 해당하는 사람
        for (int i = 0; i < 6; i++) {
            if (sym[i] == 'Y') {
                if (temp[i + 1] >= 37) {
                    cnt ++;
                }
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