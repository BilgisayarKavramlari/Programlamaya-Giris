#include <stdio.h>

int main(){

    /*
    mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız 
    */

   int saat_sure;
   float tam_saat,hiz , dk_sure , kalan_km, kalan_dk,mesafe;
    printf("km cinsinden mesafeyi giriniz : ");
    scanf("%f",&mesafe);

    printf("hizinizi giriniz : ");
    scanf("%f",&hiz);

    saat_sure =(mesafe/hiz);
    kalan_km =(mesafe-(hiz*saat_sure));
    tam_saat = (kalan_km/hiz);
    kalan_dk=(tam_saat*60);
    printf("Hedefe varma sureniz : %d saat, %.4f dakika",saat_sure,kalan_dk);
    
    return 0;

}
