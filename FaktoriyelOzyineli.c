#include<stdio.h>

int fact(int);
int main(){
    int a;
    printf("Bir sayi giriniz: ");
    scanf("%d",&a);
    printf("Faktoriyeli: %d",fact(a));
    
    return 0;
}

int fact(int x){
    if(x==0)
        return 1;
    return x*fact(x-1);
}
