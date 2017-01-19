#include <stdio.h>

int fakt(int gelen) // ozyineli faktoriyel fonksiyonu
{
	if (gelen == 0 || gelen == 1)
	{
		return 1;
	}
	else
	{
		return gelen * fakt(gelen - 1);
	}
}

int main()
{
	int sayiBir, sayiIki, sonuc = 0;
	do
	{
		printf("Lutfen bir bosluk ile iki sayi giriniz: ");
		scanf("%d%d", &sayiBir, &sayiIki);		
	}
	while(sayiBir < sayiIki); //Secim sayisi eleman sayisindan buyuk olamaz.
	sonuc = fakt(sayiBir) / (fakt(sayiIki) * fakt(sayiBir - sayiIki)); // n!/(r!*(n-r)!)
	printf("C(%d, %d) = %d", sayiBir, sayiIki, sonuc);
}
