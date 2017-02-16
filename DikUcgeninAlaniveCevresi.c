#include <stdio.h>
#include <math.h>
#include <conio.h>

int main(){
	printf("birinci kenari giriniz: ");
	int birinci;
	scanf("%d",&birinci);
	printf("ikinci kenari giriniz: ");
	int ikinci;
	scanf("%d",&ikinci);
	printf("ucgenin cevresi: %d\n",2*(birinci+ikinci));
	printf("ucgenin alani: %d",(birinci*ikinci)/2);
	getch();
}
