//**Created by Oğuz Kaan BULUT**


#include <stdio.h>
#include <math.h>

void dikUcgenmi(int a,int b,int c){

    char *dikucgenmi;
    dikucgenmi = pow(a,2) + pow(b,2)  == pow(c,2) 
    || pow(a,2) + pow(c,2)  == pow(b,2)  
     ||  pow(b,2) + pow(c,2)  == pow(a,2)  ? "\nDik ucgendir." 
                                           : "\nDikucgen degildir.";
	
	printf ("%s",dikucgenmi);
}

void kenarlariGir(int *a,int *b,int *c){
	
	printf("A kenarini giriniz : "); scanf("%d",a); fflush(stdin);
	
	printf("B kenarini giriniz : "); scanf("%d",b); fflush(stdin);
    
	printf("C kenarini giriniz : "); scanf("%d",c); fflush(stdin);	
}

int main(){
	
	int a,b,c; 
	char ch; 
	enum boolean{ true = 1, false = 0 };
	enum boolean yenidengir = true;
	
	kenarlariGir(&a,&b,&c); dikUcgenmi(a,b,c);
	
	while(yenidengir){
	    
		printf("\nDevam etmek istiyor musunuz? (E/H): ");
	    scanf("%c",&ch);
	
	    switch (ch) {
		
		    case 'E': 
		    case 'e':
		    	yenidengir = false;
				system("CLS");
				main();
				break;
		    case 'H':
		    case 'h':
				yenidengir = false;
				fflush(stdin);
				return 0;
	        default :
	        	fflush(stdin);
	        	printf("Gecersiz bir komut girdiniz.\a");
	    	
	    }
		
    }
    
	
}
	
	
