import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] arr = new int[100];
        int cnt = 0;

        // 정수 입력받아 배열에 저장
        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0)
                break;
            cnt ++;
        }

        // 출력
        System.out.print(arr[cnt - 1] + arr[cnt -2] + arr[cnt - 3]);
    }
}