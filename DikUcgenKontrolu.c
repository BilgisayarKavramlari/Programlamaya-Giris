#include <stdio.h>

void sirala(int* kenar)
{
	int geciciKenar = 0;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			if (kenar[i] < kenar[j])
			{
				geciciKenar = kenar[i];
				kenar[i] = kenar[j];
				kenar[j] = geciciKenar;
			}
		}
	}
}

bool dikUcgenKontrol(int * kenar)
{
	sirala(kenar); //Sıralama fonsiyonu, kullanıcının üçgenin kenar uzunluklarını rastgele girebileceği ihtimaline karşı yazılmıştır
	/*
		kenar[0] => Üçgenin en uzun kenarı (C)
		kenar[1] => Üçgenin ortanca kenarı (B)
		kenar[2] => Üçgenin en kısa kenarı (A)
	*/
	if ((kenar[2] * kenar[2]) == (kenar[0] * kenar[0] + kenar[1] * kenar[1])) return true;
	return false;
}

void main()
{
	int kenar[3];
	for (int i = 0; i < 3; i++)
	{
		printf("%d. kenarin uzunlugunu giriniz:", i + 1);
		scanf("%d", &kenar[i]);
	}
	if (dikUcgenKontrol(kenar)) printf("Bu ucgen bir dikucgeni tanimlamaktadir.\n");
	else printf("Bu ucgen bir dikucgeni tanimlamamaktadir.\n");
}
