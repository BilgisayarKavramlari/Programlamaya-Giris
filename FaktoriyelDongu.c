#include<stdio.h>

int main(){
   
    int sayi,faktoriyel=1;
    
    printf("Bir sayi giriniz: ");
    scanf("%d",&sayi);
    
    while (sayi>0) {
        faktoriyel*=sayi;
        sayi--;
    }
    
    printf("Faktoriyeli: %d",faktoriyel);
    
    
    
    return 0;
}
