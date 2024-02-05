public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 5, b = 6, c = 7;

        // 데이터 교환
        int temp1 = a;
        int temp2 = b;
        a = c;
        b = temp1;
        c = temp2;

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}