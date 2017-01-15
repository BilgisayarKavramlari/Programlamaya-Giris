#include <stdio.h>
#include <conio.h>

int main(){
	int sutun, satir;
	printf("carpim tablonuzun sutununda kac sayi olsun: ");
	scanf("%d",&sutun);
	printf("carpim tablonuzun satirinda kac sayi olsun: ");
	scanf("%d",&satir);
	for(int i=1;i<=satir;i++){
		for(int j=1;j<=sutun;j++){
			printf("%d ",i*j);
		}
	printf("\n");
	}
	getch();
}
