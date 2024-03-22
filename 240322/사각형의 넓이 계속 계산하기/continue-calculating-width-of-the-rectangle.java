import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int width, height;
        char c;

        // 문자 C가 주어지는 줄까지 사각형의 넓이를 구하기
        while (true) {
            // 정수 입력받기
            width = sc.nextInt();
            height = sc.nextInt();
            c = sc.next().charAt(0);

            if (c != 'C') {
                area = (width * height);
                System.out.println(area);
                continue;
            }         
    
            else {
                area = (width * height);
                System.out.println(area);
                break;
            }
        }
    }
}