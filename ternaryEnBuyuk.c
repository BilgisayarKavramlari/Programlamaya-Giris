/* 
*************************************
*|---------------------------------|*
*| Yazar     : Oğuz Kaan BULUT     |*
*| Allrights : Helali hoş olsun :) |*
*|---------------------------------|*
*************************************
*/


#include <stdio.h>
#include <conio.h>

void en_Buyuk_Kenar(int a,int b,int c){
    
	char *enbuyuk_enkucuk;
	
	enbuyuk_enkucuk = a>b ? ( b>c ? "en buyuk a, en kucuk c" 
		                      : ( b==c ? "en kucuk b ve c" 
					       : ( a==c ? "en buyuk a ve c" 
		                                        : ( a>c ? "en buyuk a,en kucuk b" : "en buyuk c,en kucuk b" )
		                                 )
		                        )
		                 )       
									        
	                      : ( a==b ? ( a==c ? "a,b ve c esit" 
					        : ( a<c ? "en kucuk a ve b": "en buyuk a ve b")
                                         )
                    
				       : ( b<c ? "en buyuk c,en kucuk a" 
		                               : ( b==c ? "en buyuk b ve c" 
	                                                : ( a==c ? "en kucuk a ve c" 
	                                                         : ( a>c ? "en buyuk b,en kucuk c" : "en buyuk b,en kucuk a" )
                                                          )
                                                 )
                                         )
                                 );                              
	
	    
		printf ("\n%s",enbuyuk_enkucuk);
}

int main(){
	
	int a,b,c;
	
	    printf("a sayisini giriniz : ");
	    scanf("%d",&a);
	
	    printf("b sayisini giriniz : ");
	    scanf("%d",&b);
	
	    printf("c sayisini giriniz : ");
	    scanf("%d",&c);
	
	en_Buyuk_Kenar(a,b,c);
	
	getch();
	
}
