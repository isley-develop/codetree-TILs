import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        int sum = 0, cnt = 0;
        double avg;

        // 0이상 200이하의 정수들의 합
        for(int i = 1; i <= 10; i++) {
            n = sc.nextInt();

            if (n >= 0 && n <= 200){
                sum += n;
                cnt ++;
            }
        }       

        // 평균 구하기
        avg = (double)sum / cnt;

        // 출력
        System.out.printf("%d %.1f", sum, avg);
    }
}