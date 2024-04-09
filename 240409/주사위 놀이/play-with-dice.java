import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력

        // 주사위 결과를 입력받을 수 있는 크기 10인 배열
        int[] arr = new int[10];

        // 1부터 6까지 각각 몇 번씩 나왔는지 출력하기 위한 배열 cnt
        int[] cnt = new int[7];

        // 주사위 결과 10개를 공백을 사이에 두고 입력받기
        // 입력받은 횟수 저장
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }

        // 1부터 6까지의 횟수 출력
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + cnt[i]);
        }
    }
}