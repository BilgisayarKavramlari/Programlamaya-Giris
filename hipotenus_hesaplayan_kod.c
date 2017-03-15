#include <stdio.h>
#include <math.h>

int main(void){
int kenar1,kenar2;
double hipotenus;

printf("1.dik kenari giriniz : \n");
scanf("%d",&kenar1);
printf("2.dik kenari giriniz : \n");
scanf("%d",&kenar2);

hipotenus=sqrt(kenar1*kenar1+kenar2*kenar2);
printf("girilen %d ve %d dik kenarli ucgenin hipotenusu %.2lfdir",kenar1,kenar2,hipotenus);

return 0;
}
