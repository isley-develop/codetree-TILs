#include <stdio.h>

int main() {
    // 변수 선언
    double ft =  9.2;
    double m = 1.3;

    // cm 변환
    double ft2cm = ft * 30.48;
    double m2cm = m * 160934;

    // 출력
    printf("%.1lfft = %.1lfcm\n", ft, ft2cm);
    printf("%.1lfmi = %.1lfcm", m, m2cm);

    return 0;
}