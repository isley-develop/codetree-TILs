import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt(); // 학생 수
        int cnt = 0;
        int sum;

        // 정수 10개 입력받을 배열 생성
        int arr[] = new int[4];

        // 배열에 정수 입력받기
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int a = 0; a < 4; a++) {
                arr[a] = sc.nextInt();
                sum += arr[a];
            }
            
            // 평균 
            double avg = (double) sum / 4;
            
            // 점수에 대한 통과 여부 출력
            if (avg >= 60) {
                cnt ++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }

        // 학생 수 출력
        System.out.println(cnt);
    }
}