#include <stdio.h>
#include <conio.h>

int main(){
	int boyut;
	printf("matrisin boyutunu giriniz: ");
  scanf("%d",&boyut);
	
	for(int i=0; i<boyut;i++){
		for(int j=0; j<boyut; j++){
			if(i==j){
				printf("1 ");
			}
			else{
				printf("0 ");
			}
		}
		printf("\n");
	}
	getch();
}
