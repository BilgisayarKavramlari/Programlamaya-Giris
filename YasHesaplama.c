#include <stdio.h>


int main(){

    int bu_yil , dogum_yili, yas;
    printf("Suanki yili giriniz ?");
    scanf("%d",&bu_yil);

    printf("Dogum yilinizi giriniz ?");
    scanf("%d",&dogum_yili);

    printf("Yasiniz = %d",bu_yil-dogum_yili);

    return 0 ;

}
