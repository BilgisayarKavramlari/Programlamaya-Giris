#include <stdio.h>
#include <math.h>
#include <conio.h>

int main(){
	printf("birinci kenar: ");
	int birinci;
	scanf("%d",&birinci);
	printf("ikinci kenar: ");
	int ikinci;
	scanf("%d",&ikinci);
	printf("hipotenus: %d",sqrt((birinci*birinci)+(ikinci*ikinci)));
	getch();
}
