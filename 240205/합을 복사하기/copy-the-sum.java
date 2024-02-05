public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 1, b = 2, c = 3;

        // 세 정수의 합을 각 정수에 복사
        a = b = c = a + b + c;

        // 출력
        System.out.print(a + " " + b + " " + c);
    }
}