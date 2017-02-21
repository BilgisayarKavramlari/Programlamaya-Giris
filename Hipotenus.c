#include<stdio.h>     //printf scanf kütüphanesi
#include<math.h>     //karekök için matematik kütüphanesi

int main(){
	float a,b,c;      // dik üçgende lazım olan 3 kenar değişkeni
	
	printf("Lutfen 1. kenari giriniz:");      //ilk sayiyi istiyor
	scanf("%f" ,&a);                		  //ilk sayiyi aliyor
	printf("Lutfen 2. kenari giriniz:");	  //ikini sayiyi istiyor
	scanf("%f" ,&b);      					  //ikinci sayiyi aliyor
	
	c = sqrt(a*a + b*b);                     // 2kenarı hiponetüs formülü ile hesaplayıp c değişkenine atiyor
	
	printf("%.2f ve %.2f sayinin hipotenusu %.2f dir." ,a,b,c);     //hangi 2kenarı kullandığını ve sonucunu bastıriyor
}
