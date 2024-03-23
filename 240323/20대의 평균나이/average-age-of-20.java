import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int age;
        int cnt = 0, sum = 0;

        // 20대가 아닌 다른 나이대의 사람이 나오기 전까지 입력받기
        while (true) {
            // 정수 입력받기
            age = sc.nextInt();

            if (age > 29) {
                break;
            }
            if (age < 20) {
                break;
            }
            
            sum += age;
            cnt++;
        }

        // 평균 구하기
        double avg = (double) sum / cnt;

        // 입력된 나이들의 평균 출력
        System.out.printf("%.2f", avg);
    }
}