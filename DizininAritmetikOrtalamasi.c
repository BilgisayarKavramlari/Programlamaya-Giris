#include <stdio.h>
#include <locale.h>
#pragma warning(disable : 4996)
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
	int toplam = 0;
	float artOrtalama;

	for (int i = 0; i < diziUzunlugu; i++)
	{
		toplam = toplam + *(dizi + i);
	}
	artOrtalama = (float)toplam / diziUzunlugu;
  printf("Toplam : %f", artOrtalama);
	printf("\n");
	system("pause");
}
