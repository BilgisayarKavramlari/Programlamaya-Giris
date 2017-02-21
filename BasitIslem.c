#include <stdio.h>
int main(){
int sayi1,sayi2;
printf("Lutfen birinci sayiyi giriniz ");
scanf("%d",&sayi1);
printf("Lutfen ikinci sayiyi giriniz ");
scanf("%d",&sayi2);
printf("toplam: %d\n",sayi1+sayi2);
printf("fark: %d\n",sayi1-sayi2);
printf("carpim: %d\n",sayi1*sayi2);
printf("bolum: %f\n",(float)sayi1/sayi2);
printf("kalan: %d\n",sayi1%sayi2);
}
