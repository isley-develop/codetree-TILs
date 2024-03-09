import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자 10개를 저장할 수 있는 배열 만들기
        char[] arr = new char[10];

        // 10개의 문자를 입력받기
        for (int i = 0; i <= 9; i++) {
            arr[i] = sc.next().charAt(0);
        }

        // 입력받은 문자의 순서를 거꾸로 출력하기
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}