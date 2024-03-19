import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소 개수 입력받을 변수 선언
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 배열 생성
        int[] arr = new int[10];

        // 첫 번째, 두 번째 항
        arr[0] = a;
        arr[1] = b;

        // 전전항과 전항 합의 1의 자리로 배열 채우기
        for (int i = 2; i < 10; i++) {
            arr[i] = ((arr[i - 1] + arr[i - 2]) % 10);
        }

        // 배열 10개 원소 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}