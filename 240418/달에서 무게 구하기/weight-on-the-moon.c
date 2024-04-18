#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.

    int a = 13; // 추의 무게
    double b = 0.165; // 달에서의 중력 비율
    double c = a * b;

    printf("%d * %.6lf = %.6lf", a, b, c);
    return 0;
}