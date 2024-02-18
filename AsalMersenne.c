#include <stdio.h>
int main(){
int a,toplam=1,b,flag=1;
for(a=1;a<=20;a++){
  for(b=a;b<=a;b++){
    flag=1;
    toplam=toplam*2;
    int cevap=toplam-1;
    for(int k=2;k<cevap;k++){
        if (cevap%k==0){
            flag=0;
            break;
        }
    }
if(flag==1 && cevap!=1){
printf("\n%d. Asal Mersenne sayisi %d\n",b,cevap);
}
}
}

return 0;
}
