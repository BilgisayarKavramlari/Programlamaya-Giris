#include <stdio.h>
#include <typeinfo>

void ucgen_ciz(int *);
int main (void)
{

	int *sayi = new int;

	printf("Ikizkenar dik ucgenin esit olan kenarlarindan birinin uzunlugunu giriniz...\n");
	scanf("%d",sayi);
    
    int kontrol = 5;

    if(*sayi < 2 || typeid(*sayi).name() != typeid(kontrol).name() ){  //girilen sayıdan ikizkenar dik üçgen oluşturabilmek için en az 2 olması lazım. Bir diğer kontrol ise girilen sayının tam sayı olup olmadığı aksi halde uyarı mesajı verip çalışmayı durduracağız.
        printf("Lutfen 2'den buyuk ve bir tam sayi degeri giriniz.");
        return 0;
    }

	ucgen_ciz(sayi);

	delete sayi;

	return 0;
}

void ucgen_ciz(int *ptr)
{
	
	for(int i = 1 ; i<=*ptr; i++)    //i.satırda : *ptr-i kadar boşluk olacak, i kadar yıldız olacak.
	{
		
		for(int a = 1 ; a <=*ptr-i;a++)
			printf(" ");
		
		
		for(int a = i ; a>0 ; a--)
			printf("*");
		
		printf("\n");
	}
		

}
