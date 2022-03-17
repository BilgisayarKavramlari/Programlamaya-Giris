#include <stdio.h>


void ucgen_ciz(int *);

int main (void)
{

	int *sayi = new int;
	
	printf("Ikizkenar dik ucgenin esit olan kenarlarindan birinin uzunlugunu giriniz...\n");
	scanf("%d",sayi);
	
	ucgen_ciz(sayi);
	
	delete sayi;
	
	return 0;
}

void ucgen_ciz(int *ptr)
{
	
	
	for(int i = 1 ; i<=*ptr; i++){
	
		for(int j = 1 ; j<=i ; j++)
			printf("*");
		
		printf("\n");
	}
	
}
