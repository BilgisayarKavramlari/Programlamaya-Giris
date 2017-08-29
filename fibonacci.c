#include<stdio.h>

int main(){

	int a=1, b=1, c, sayi;
	
	printf("Bir sayi giriniz: "); //kac adet sayi yazdiracagimizi belirliyoruz.
	scanf("%d",&sayi);
	
	printf("%d\n%d",a,b);	//ilk 2 fibonacci sayisini yazdiriyoruz.
	
	for(int i=0; i<sayi-2; i++){ //2 tanesini yazdirdigimiz icin sayi-2 kez donduruyoruz.
		c=a+b;
		printf("\n%d",c);
		a=b;
		b=c;
	}
	
	
	return 0;
}
