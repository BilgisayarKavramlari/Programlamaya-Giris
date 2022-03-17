#include <stdio.h>
#include <typeinfo>

void eskenar_dortgen(int *);
int main (void)
{

	int *sayi = new int;

	printf("Eskenar dortgenin kenarlarindan birinin uzunlugunu giriniz...\n");
	scanf("%d",sayi);
    
    int kontrol = 5;

    if(*sayi < 2 || typeid(*sayi).name() != typeid(kontrol).name() ){  //girilen sayıdan eşkenar dörtgen oluşturabilmek için en az 2 olması lazım. Bir diğer kontrol ise girilen sayının tam sayı olup olmadığı aksi halde uyarı mesajı verip çalışmayı durduracağız.
        printf("Lutfen 1'den buyuk ve bir tam sayi degeri giriniz.");
        return 0;
    }

	eskenar_dortgen(sayi);

	delete sayi;

	return 0;
}

void eskenar_dortgen(int *ptr)
{
	
for(int i = 0 ; i<*ptr;i++)
{
	for(int j = 0 ; j<*ptr; j++)
		printf("*");
	
	printf("\n");
}
		

}
