#include <stdio.h>
int main(){
	int a;
	printf("Notunuzu giriniz ");
	scanf("%d",&a);
	if(a>100||a<0){
		printf("Hatali girish");
	}
	else if(a>=90){
		printf("Harf notunuz: A");
	}
	else if(a>=80){
		printf("Harf notunuz: B");
	}
	else if(a>=70){
		printf("Harf notunuz: C");
	}
	else if(a<70){
		printf("Harf notunuz: F");
	}
	
}
