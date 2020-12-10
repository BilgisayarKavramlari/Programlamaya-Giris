#include <stdio.h>

int main() {

    int m, n, i, j, a, b, temp, k;
    //Kullanici dogruboyut degeri girinceye kadar calisan dongu
    do {
        printf("\nLutfen matris carpimina uygun boyut giriniz:\n");
        printf("Birinci matrisin boyutunu giriniz: (m n)\n");
        scanf("%d %d", &m, &n);

        printf("Ikinci matrisin boyutunu giriniz: (a b)\n");
        scanf("%d %d", &a, &b);
    } while (n != a || (a <= 0 || b <= 0 || m <= 0 || n <= 0));

    int matris1[m][n];
    int matris2[a][b];
    int matris3[m][b];

    printf("Birinci matrisin elemanlarini giriniz:\n");
    //i = satir    j=sütun
    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &matris1[i][j]);
        }
    }

    printf("Ikinci matrisin elemanlarini giriniz:\n");
    //i = satir    j=sütun
    for (i = 0; i < a; i++) {
        for (j = 0; j < b; j++) {
            scanf("%d", &matris2[i][j]);
        }
    }
    //Birinci matrisi yazdirmak icin
    printf("%d x %d Birinci matris\n", m, n);
    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            printf(" %d", matris1[i][j]);
        }
        printf("\n");
    }
    //Ikinci matrisi yazdirmak icin
    printf("\n");
    printf("%d x %d Ikinci matris\n", a, b);
    for (i = 0; i < a; i++) {
        for (j = 0; j < b; j++) {
            printf(" %d", matris2[i][j]);
        }
        printf("\n");
    }
/*
    matris carpimi icin kisa ornek
        c11 = a11*b11 + a12*b21
        c12 = a11*b12 + a12*b22
        c21 = a21*b11 + a22*b21
        c22 = a21*b12 + a22*b22
*/

    for (i = 1; i <= m; i++) {
        for (j = 1; j <= b; j++) {
            temp = 0;
            for (k = 1; k <= n; k++) {
                temp += matris1[i - 1][k - 1] * matris2[k - 1][j - 1];
            }
            matris3[i - 1][j - 1] = temp;
        }
    }

    printf("\n\n%d x %d Sonuc matrisi\n", m, b);
    for (i = 0; i < m; i++) {
        for (j = 0; j < b; j++) {
            printf("  %d", matris3[i][j]);
        }
        printf("\n");
    }

    return 0;
}
