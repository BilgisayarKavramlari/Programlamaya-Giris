//Created by Oğuz Kaan BULUT
//Alllefts for everyone.

#include <stdio.h>

int  main();

enum boolean { true = 1, false = 0 };

void      degerleriGir(int*,int*);
int       faktoriyel(int);
int       kombinasyon(int,int);
void      kombinasyonSonucu(int,int);
void      tamam_yada_devam();


int main(){
	
	int n,r;
	degerleriGir(&n,&r);
	kombinasyonSonucu(n,r);
	tamam_yada_devam();
	
	return 0;
}

void degerleriGir(int *n,int *r){
	
	enum boolean r_n_den_buyuk;
	enum boolean n_kucuk_0_ve_buyuk_12;
	
	printf("Kombinasyon n sayisi: "); 
	scanf("%d",n); 
	fflush(stdin);
	n_kucuk_0_ve_buyuk_12 = *n >= 0 && *n < 13 ? true : false;
	
	while (!n_kucuk_0_ve_buyuk_12){
	
		printf("\nLutfen 0-12 kapali araliginda\nbir r sayisi giriniz: ");
		scanf("%d",n);
		fflush(stdin);
		n_kucuk_0_ve_buyuk_12 = *n >= 0 && *n < 13 ? true : false;
	}
	
	printf("\nKombinasyon r sayisi: ");
	scanf("%d",r);
	fflush(stdin);
	r_n_den_buyuk = *r > *n ? true : false;
	
	while (r_n_den_buyuk){
	
		printf("\nLutfen n sayisindan kucuk\nbir r sayisi giriniz: ");
		scanf("%d",r);
		fflush(stdin);
		r_n_den_buyuk = *r > *n ? true : false;
	}
}

int faktoriyel(int sayi){
	
	return ( sayi >= 2 ) ? ( sayi * faktoriyel(sayi - 1) ) : 1 ;
}

int kombinasyon(int n, int r){
	
	return faktoriyel(n) / ( faktoriyel(r) * faktoriyel ((n-r)) );
}

void kombinasyonSonucu(int n,int r){
	
	printf("\n%d ile %d kombinasyonunun sonucu %d'dir\n",n,r,kombinasyon(n,r));
}

void tamam_yada_devam(){
	
	char secim;
	enum boolean yanlisKomut = true;
	
	while(yanlisKomut){
	
		printf("\nYeni bir kombinasyon hesaplamak icin d tusuna;\nProgramdan cikmak icin ise t tusuna basiniz: ");
		scanf("%c",&secim);
		
		switch (secim){
		
			case 'D':
			case 'd':
				yanlisKomut = false;
				system("CLS");
				main();
				break;
			case 'T':
			case 't':
				yanlisKomut = false;
				fflush(stdin);
				break;
			default :
				fflush(stdin);
				printf("\nGecersiz komut : \"%c\" \n",secim);
		}
	}
}
