#include <stdio.h>
#include <conio.h>//windows kullananlar icin

int main(){
	int a;
	printf("ogrencinin notunu giriniz: ");
	scanf("%d",&a);
	if(a >=90){
		printf("%d alan ogrencinin harf notu: AA",a);
	}
	else if(a>=80){
		printf("%d alan ogrencinin harf notu: BA",a);
	}
	else if(a>=70){
		printf("%d alan ogrencinin harf notu: BB",a);
	}
	else if(a>=60){
		printf("%d alan ogrencinin harf notu: CB",a);
	}
	else if(a>=50){
		printf("%d alan ogrencinin harf notu: CC",a);
	}
	else{
		printf("%d alan ogrencinin harf notu: FF",a);
	}
  getch();//windows kullananlar icin
}
