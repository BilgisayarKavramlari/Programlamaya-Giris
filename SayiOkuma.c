#include <stdio.h>
#include <conio.h>//windows kullananlar icin programi calistirdiginizda kapanmadan once bir tusa basilmasini beklemeyi sagliyor

int main(){
  printf("bir sayi giriniz: ");
  int girdi; //bir integer belirliyorum
  scanf("%d",&girdi); //scanf ile bir deger alip az once belirledigim integera atiyorum
  printf("girdiginiz sayi: %d",girdi); //degeri ekrana yazdiriyorum
  getch();//windows kullananlar icin
}
