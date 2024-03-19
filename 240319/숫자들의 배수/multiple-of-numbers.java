import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소 개수 입력받을 변수 선언
        int n = sc.nextInt();
        int cnt_n = 0, cnt_5 = 0;

        // 배열 생성
        int[] arr = new int[10];

        // 배열에 n개의 원소 입력받기
        for(int i = 0; i < 10; i++) {
            arr[i] = (n * (i+1));
            cnt_n ++;

            // 5의 배수 카운트
            if (arr[i] % 5 == 0)
                cnt_5 ++;

            if (cnt_5 == 2)
                break;
        }

        for(int i = 0; i < cnt_n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}