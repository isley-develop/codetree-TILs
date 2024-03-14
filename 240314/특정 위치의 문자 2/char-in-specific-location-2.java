import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개 문자 입력받을 배열 생성
        char arr[] = new char[10];

        // 10개 문자 입력받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }

        // 두 번째, 다섯 번째, 여덟 번째 문자를 차례로 공백을 사이에 두고 출력       
        System.out.print(arr[1] + " " + arr[4] + " " + arr[7]);
    }
}