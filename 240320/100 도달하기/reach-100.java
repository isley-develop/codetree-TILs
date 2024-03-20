import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 생성
        int arr[] = new int[100];

        // 정수 n 입력받기
        int n = sc.nextInt();
        int cnt = 1;

        // 첫 번째 항은 1로 초기화
        // 정수 n을 두 번째 항으로 초기화
        arr[0] = 1;
        arr[1] = n;

        // 전전항과 전항을 더한 수가 100을 넘길 때까지 배열 채우기
        for(int i = 2; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            cnt ++;

            if(arr[i] >= 100)
                break;
        }

        // 출력
        for(int i = 0; i <= cnt; i++){
            System.out.print(arr[i] + " ");
        }
    }
}