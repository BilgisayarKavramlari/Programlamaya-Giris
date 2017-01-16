#include <stdio.h>
#include <conio.h>

int main(){
	printf("bir isci yaptigi isi kac gunde bitirebilmektedir: ");
	int birisci;
	scanf("%d",&birisci);
	printf("toplam kac isci calisacak: ");
	int xisci;
	scanf("%d",&xisci);
	printf("isin bitme suresi %d gundur.",birisci/xisci);
	getch();
}
