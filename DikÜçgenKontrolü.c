#include <stdio.h>

void kontrolEt(){
        int x,y,z;
        printf("Birinci Kenar: ");
        scanf("%d", &x);
        printf("İkinci Kenar: ");
        scanf("%d", &y);
        printf("Üçüncü Kenar: ");
        scanf("%d", &z);

        if(x*x+y*y==z*z){
                printf("Bu Üçgen Diktir.\n");
        }
        else{
                printf("Bu Dİk Üçgen Değildir.\n");
        }
}

void main(){
        kontrolEt();
}

