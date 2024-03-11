import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 8명의 점수를 입력받을 배열
        double[] arr = new double[8];
        double sum = 0;

        // 점수 입력받기
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        // 평균 구하기
        double avg = sum / 8;

        // 출력
        System.out.printf("%.1f", avg);
    }
}