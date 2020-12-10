#include <stdio.h>

int main() {
    int m, n, i, j;
    printf("Matris boyutunu giriniz: (m n)\n");
    scanf("%d %d", &m, &n);

    int matris[m][n];
    int newmatris[n][m];
    printf("Matris elemanlarini giriniz:\n");

    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &matris[i][j]);
        }
    }
    printf("\n");
    printf("Orijinal Matris\n");

    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            printf("%d ", matris[i][j]);
        }
        printf("\n");
    }

    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            newmatris[j][i] = matris[i][j];
        }
    }
    printf("\n");
    printf("Matrisin Transpozu\n");

    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
            printf("%d ", newmatris[i][j]);
        }
        printf("\n");
    }

    return 0;
} 
