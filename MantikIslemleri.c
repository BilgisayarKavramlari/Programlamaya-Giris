#include <stdio.h>
#include <conio.h>
int main(){
  int a,b;
  printf("lütlen bir sayı giriniz");
  scanf("%d", &a);
  printf("lütfen bir sayı giriniz");
  scanf("%d", &b);
  printf("%d", a==b);
  printf("%d", a!=b);
  printf("%d", a<b);
  printf("%d", b>a);
  printf("%d", a<=b);
  printf("%d", b<=a);
  getch ();
  return 0;
}
