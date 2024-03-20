import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[100];
        int cnt = 0;

        // 입력받은 정수를 배열에 저장하다 0이 주어지면 멈추기
        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                break;
            cnt ++;
        }

        // 0 입력받기 직전 정수들을 규칙에 맞게 출력
        // 홀수이면 3을 더한 값을, 짝수이면 2로 나눈 몫을 출력
        for(int i = 0; i < cnt; i++) {
            if (arr[i] % 2 != 0)
                System.out.print((arr[i] + 3) + " ");
            if (arr[i] % 2 == 0)
                System.out.print((arr[i] / 2) + " ");
        }
    }
}