import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 생성
        int arr[] = new int[10];

        // 정수 n 입력받기
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int cnt = 1;

        // 수열의 첫 번째, 두 번째 항 초기화
        arr[0] = A1;
        arr[1] = A2;

        // 세 번째 항부터 An = An-1 + 2*An-2 조건을 만족하며 배열 채우기
        for(int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + (2 * arr[i - 2]);
            cnt ++;
        }

        // 10번째 항까지 출력
        for(int i = 0; i <= cnt; i++){
            System.out.print(arr[i] + " ");
        }
    }
}