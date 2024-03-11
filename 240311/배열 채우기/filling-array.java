import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개 정수 저장할 배열 선언
        int[] arr = new int[10];

        // 변수 선언
        int cnt = 0;

        // 정수 입력받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            // 입력받은 정수가 0이 아닌 경우
            if (arr[i] != 0) {
                cnt++;
            }

            // 입력받은 정수가 0인 경우
            if (arr[i] == 0)
                break;
        }

        // 가장 나중에 입력된 정수부터 차례대로 출력
        for (int a = (cnt - 1); a >= 0; a--) {
            System.out.print(arr[a] + " ");
        }
    }
}