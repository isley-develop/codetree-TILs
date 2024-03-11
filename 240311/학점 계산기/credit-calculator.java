import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목 수 n 입력받기
        int n = sc.nextInt();

        // 크기가 n인 실수형을 저장하기 위한 배열
        double[] arr = new double[n];
        double sum = 0, avg = 0;
        int cnt = 0;

        // 배열에 n개 과목 학점 입력받고 학점 합계 구하기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
            cnt ++;
        }

        // 평균
        avg = sum / (double)cnt;

        // 평균학점 출력
        System.out.printf("%.1f\n", avg);

        // 평균 학점에 해당하는 등급 출력
        if (avg >= 4.0){
            System.out.print("Perfect");
        }
        else if (avg >= 3.0) {
            System.out.print("Good");
        }
        else {
            System.out.print("Poor");
        }
    }
}