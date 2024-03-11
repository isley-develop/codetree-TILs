import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목 수 n 입력받기
        int n = sc.nextInt();

        // 크기가 n인 실수형을 저장하기 위한 배열
        double[] arr = new double[n];
        double sum = 0, avg = 0;

        // 배열에 실수 입력받기, 입력받은 실수 합 구하기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        // 평균 구하기
        avg = sum / n;

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