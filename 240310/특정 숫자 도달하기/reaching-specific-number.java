import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 만든 뒤 초기값 설정
        int[] arr = new int[10];
        // 합계, 평균 변수 선언
        int sum = 0;
        double avg = 0;

        // 10개의 문자 입력받기
        for (int i = 0; i <= 9; i++) {
            arr[i] = sc.nextInt();
            if (i <= 4) {
                sum += arr[i];
            }
        }

        // 평균 구하기
        avg = (double)sum / 5; 

        // 입력받은 문자의 순서를 거꾸로 출력하기
        System.out.printf("%d %.1f", sum, avg);
    }
}