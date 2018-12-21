#include <stdio.h>
#include <conio.h>

int main(){
	printf("hangi yilda oldugumuzu giriniz: ");
	int simdi;
	scanf("%d",&simdi);
	printf("dogdugunuz yili giriniz: ");
	int dogum;
	scanf("%d",&dogum);
	printf("%d yasindasiniz.",simdi-dogum);
	getch();
}
