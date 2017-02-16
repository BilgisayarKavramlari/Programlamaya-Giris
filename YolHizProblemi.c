#include <stdio.h>
#include <conio.h>

int main(){
  int yol, hiz, sure;
  printf("mesafeyi giriniz: ");
  scanf("%d",&yol);
  printf("hizi giriniz: ");
  scanf("%d",&hiz);
  sure = yol / hiz;
  printf("sure %d saattir",sure);
  getch();
}
