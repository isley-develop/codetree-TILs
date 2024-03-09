import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 만들기
        int[] arr = new int[10];

        // 변수 선언
        int sum = 0; 

        // 주어진 10개 원소의 합
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 출력
        System.out.print(sum);
    }
}