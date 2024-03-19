import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소 개수 입력받을 변수 선언
        int n = sc.nextInt();

        // 배열 생성
        int[] arr = new int[n];

        // 배열에 n개의 원소 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // n개의 원소 중 짝수인 값만 출력
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}