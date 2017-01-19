#include <stdio.h>

int main()
{
	float mesafe, hiz, sure;
	printf("Lutfen mesafeyi giriniz: ");
	scanf("%f", &mesafe);
	printf("Lutfen hizinizi giriniz: ");
	scanf("%f", &hiz);
	sure = mesafe / hiz;
	printf("%.1f saatte ulasacaksiniz.", sure);
}
