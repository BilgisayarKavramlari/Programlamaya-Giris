#include <stdio.h>
#include <conio.h>

int main(){
	int boyut;
	printf("matrisin boyutunu giriniz: ");
	scanf("%d",&boyut);
	
	for(int i=0; i<boyut;i++){
		for(int j=boyut-1; j>=0; j--){ //j yi 'boyut'tan baslatarak ilk 1 i sag ust koseye yerlestirmis oluruz. 
			if(j==i){ //i yatayda ilerledikce j kuculur. ayni degere sahip olduklari yerler ters kosegen matris olusturur
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
