import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자 배열 선언
        int [] arr = new int[10];
        
        // 변수 선언
        int cnt = 0;

        // 원소 중 3의 배수가 처음으로 등장하는 부분의 바로 앞 원소를 출력
        for(int i = 0; i < 10; i++) { 
            arr[i] = sc.nextInt();

            if (arr[i] % 3 == 0)
                break;
            
            cnt ++;
        }

        System.out.print(arr[cnt - 1]);
    }
}