import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소 개수 입력받을 변수 선언
        int n = sc.nextInt();

        // 배열 생성
        int[] arr = new int[n];

        // 주어진 n개의 원소에 각각 제곱을 하여 출력
        for (int i = 0; i < n; i++) {
            arr [i] = sc.nextInt();
            arr[i] *= arr[i];
            System.out.print(arr[i] + " ");
        }
    }
}