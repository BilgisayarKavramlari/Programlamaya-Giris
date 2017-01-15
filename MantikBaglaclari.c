#include <stdio.h>
int main(){
	int a,b,c;
	printf("a-ni giriniz: \n a=");
	scanf("%d",&a);
	printf("b-ni giriniz: \n b=");
	scanf("%d",&b);
	printf("c-ni giriniz: \n c=");
	scanf("%d",&c);
	// a-nin b ve c arasinda olup olmadiginin kontrol et
	if (a<b&&a>c||a>b&&a<c){
		printf("a b ve c arasinda bir sayi\n ");
	}
	else{
		printf("a b ve c arasinda bir sayi degildir\n ");
	}
	//a-nin b-ye eshit ve c-den kuchukmu diye kontrol et
	if(a==b&&a<c){
		printf("a b-ye eshit ve c-den kuchuk\n ");
	}
	//a-nin b-ye eshit ve c-den buyukmu diye kontrol et
	if(a==b&&a>c){
		printf("a b-ye eshit ve c-den buyuk\n ");
	}
	// a beden ve ya c-den boyuk olup olmadigini kontrol et
	if(a>b||a>c){
		printf("a b-den ve ya c-den buyuk\n ");
	}
	else{
		printf("a b-den ve ya c-den kuchuk\n ");
	}
	// uchnunde bir birine eshit olup olmadigini kontrol et
	if(a==b&&a==c){
		printf("sayilar eshit\n ");
	}
	else {
		printf("sayilar eshit digildir\n ");
	}
}
