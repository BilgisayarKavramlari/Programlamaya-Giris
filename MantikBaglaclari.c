#include <stdio.h>
#include <conio.h>
int main(){
  int a,b,c;
  printf("lütfen sırasıyla a b ve c sayıları yazın");
  scanf("%d%d%d", &a, &b, &c);
  printf("\n%d", c>a>b || b>a>c);
  printf("\n%d", a==b && a<c);
  printf("\n%d", a>b && a>c);
  printf("\n%d", a==b==c);
  getch ();
  return 0;
}
