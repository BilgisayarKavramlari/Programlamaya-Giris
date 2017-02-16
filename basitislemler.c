#include "stdio.h"
#include "conio.h"
main()
{
int s1,s2;
printf("birinci sayiyi giriniz: ");scanf("%d",&s1);
printf("ikinci sayiyi giriniz:");scanf("%d",&s2);
printf("toplama %d\ncikarma %d\ncarpma %d\nbolme %d\nkalan %d",s1+s2,s1-s2,s1*s2,s1/s2,s1%s2);
getch();
}
