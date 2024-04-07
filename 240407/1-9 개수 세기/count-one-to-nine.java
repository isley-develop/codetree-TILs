import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언, 입력
        // 원소의 개수(n) 입력받기 (크기는 1 이상 9 이하)
        int n = sc.nextInt();

        // 입력받을 수 있는 원소 개수(n)가 최대 100개이므로 크기 100인 배열
        int[] arr = new int[100];

        // 1부터 9까지 각각 몇 번씩 나왔는지 출력하기 위한 배열 cnt
        int[] cnt = new int[10];

        // n개의 원소 공백을 사이에 두고 입력받기
        // 입력받은 횟수 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }

        // 1부터 9까지의 횟수 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(cnt[i]);
        }
    }
}