#include <stdio.h>
#include <locale.h>
#pragma warning(disable : 4996) //scanf() hatasını yok sayar.
int main() 
{
	setlocale(LC_ALL, "Turkish");
	int diziUzunlugu, *dizi, enBuyuk, enKucuk;
	printf("Lütfen Dizi Büyüklüğü Giriniz: ");
	scanf("%d",&diziUzunlugu);
	dizi = (int *)malloc(sizeof(int)*diziUzunlugu);
	for (int i = 0; i < diziUzunlugu; i++)
	{
		printf("%d.Eleman : ", i);
		scanf("%d", (dizi + i));
	}
	//bubble sort büyükten küçüğe doğru sıralıyor.
	for (int i = 0; i < diziUzunlugu; i++)
	{
		for (int j = 0; j < diziUzunlugu-1; j++)
		{
			if (*(dizi + j)<*(dizi+j+1))
			{
				int temp=*(dizi +j+1);
				*(dizi + j + 1) = *(dizi + j);
				*(dizi + j) = temp;
			}
		}
	}
	int toplam=0;
	for (int k = 0; k < 3; k++)
	{
		toplam = toplam + *(dizi + k);
	}
	printf("İlk büyük 3 terimin toplamı : %d", toplam);
	printf("\n");
	system("pause");
}
