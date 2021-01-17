/*
Elemanlarını inputla girilen dizinin (dinamik dizi)
En büyük ve En küçük çift sayısını bulan program.
*/
#pragma warning(disable : 4996) //VS'de scanf() komut hatasını kaldırıyor.
#include <stdio.h>
#include <locale.h>  //Türkçe karakter için gerekli olan kütüphane.

int main() 
{
	setlocale(LC_ALL, "Turkish"); //printf'de türkçe karakterleri gösterir.

	int enBuyukCiftSayi=NULL, enKucukCiftSayi=NULL, i, diziUzunlugu, *dizi;
	printf("Dizi uzunluğunu giriniz : ");
	scanf("%d", &diziUzunlugu);
	dizi = (int*) malloc(sizeof(int)*diziUzunlugu); //dinamik Dizi
	
	for (int i = 0; i < diziUzunlugu; i++)
	{
		printf("\n%d.Eleman : ", i);
		scanf("%d",(dizi + i));
	}
	
	for (i = 0; i < diziUzunlugu; i++) //bu döngü ilk çift sayıyı bulana kadar çalışır.
	{
		if (dizi[i] % 2 == 0)
		{
			//en büyük ve en küçük çift sayı kabul edilir. 
			enBuyukCiftSayi = dizi[i];
			enKucukCiftSayi = dizi[i];
			for (int j = i + 1; j < diziUzunlugu; j++)
			{
				if (dizi[j] % 2 == 0)
				{
					if (enBuyukCiftSayi < dizi[j])
						enBuyukCiftSayi = dizi[j];
					else if (enKucukCiftSayi > dizi[j])
						enKucukCiftSayi = dizi[j];
				}
				else
					continue;
			}
			break;
		}
	}

	if (enBuyukCiftSayi==NULL || enKucukCiftSayi== NULL) // Çiftsayı yoksa buraya girer.
		printf("Dizide çift sayı yok");
	else
		printf("\nEn Büyük Çift Sayı : %d \t En küçük çift sayı : %d", enBuyukCiftSayi, enKucukCiftSayi);

	printf("\n");
	system("pause");

}
