#include<stdio.h>

int main(){


	for(int i=100;i>0;i--){ //100 den 0 a kadar olan sayilar
	
		if(i%13==0){ //tam bolunuyor mu kontrol ediyoruz
			printf("%d\n",i);
		}
	}


	return 0;
}
