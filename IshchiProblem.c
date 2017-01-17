#include <stdio.h>
int main(){
	int ishchi,i;
	float saat,d=0,b;
	printf("\tIshchi Problem chozumu proqramimiza hosh geldiniz.\n\n");
	printf("\tBrogramimiz 2 adimdan olushuyor.\n\n");
	printf("\t1-ci adimda kach ishchi oldugunu giriyoruz. \n\n");
	printf("\t2-ci adimda ise girdigimiz her ishchi ichin sirayla saatlerimizi giriyoruz.\n\n");
	printf("\tBashlamak ichin her hangi bir tusha basa bilirsin :)\n\n");
	printf("***----------------------------------------------------------------------------------***\n");
	getch();
	
	// b-her ishchi bir ishi kach saate yapar
	// d-tum ishchilerin 1 saatde yaptiklari ishin toplami
	printf("Kach ishchi var? ");
	scanf("%d",&ishchi);
	//0 ve 0-dan az ishchi girilirse mesaj ver ve ishchi sayisini yeniden sor
	while(ishchi<1){	
		if(ishchi<1){
		printf("Yalnish ishchi girishi. Ishchi sifir ve sifirdan kuchuk olamaz\n");
		printf("Ishci sayisini yeniden giriniz ");
		scanf("%d",&ishchi);
	}
}
	for(i=1;i<=ishchi;i++){
	
	
		printf("%d-ci ishchi ishi kach saata bitiriyor ? ",i);
		scanf("%f",&b);
		//0 ve 0-dan kuchuk saat girilirse mesaj ver ve ayni ishchinin saatini yeniden sor
		if(b<=0){
			printf("Yalnish saat. Saat sifir ve sifirdan kuchuk olamaz\n Ihschi saatini yeniden gir\n");
			i=i-1;
		}
		else{
		// d-tum ishchilerin 1 saatde yaptiklari ishin toplami
		d=d+1/b;
	}
	}
	//tum ishchilerin birlikde 1 ishi yapmak ichin harcadiklari zaman
	printf("%.2f saatde ish biter",saat=1/d);

}
