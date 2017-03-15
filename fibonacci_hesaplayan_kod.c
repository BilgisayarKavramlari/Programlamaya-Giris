#include <stdio.h>

int fibonacci(int);

int main(void){

int sayi,i,sonuc=0;

printf("fibonacci sayisi (n)=(n-1)+(n-2) seklinde kendisinden onceki\n ");
printf("2 sayinin toplami seklinde hesaplanir. Gosterilecek fibonacci sayisi adedini giriniz :\n");
scanf("%d",&sayi);

for(i=1;i<=sayi;i++){
	sonuc=fibonacci(i);
	printf("%d.ci fibonacci sayisinin degeri %d dir\n",i,sonuc);
}

return 0;
}

int fibonacci(int sayi ){
if (sayi==1 || sayi==2) return 1;

else return fibonacci(sayi-1)+fibonacci(sayi-2);
}
