//Created by Oğuz Kaan BULUT.
//All-lefts reserved.

#include <stdlib.h>
#include <stdio.h>
#include <conio.h>


enum boolean {true = 1, false = 0};

int main(){
	
	printf("\n ----------------------------------------------------------------\n\t\t SPIRAL CIZME ORTAMINA HOSGELDINIZ!!!!");
	printf("\n ----------------------------------------------------------------\n\n");
	printf("\n\t TUS GOREVLERI:\n");
	printf("\n\t Yukari: w          Asagi: s \n\t Sag: d             Sol: a\n");
	printf("\n\t Cizim ekrani temizle: r");
	printf("\n\t Cikis: Esc\n\n");
	printf("\n\t Baslamak icin herhangi bir tusa basiniz:");
	
	getch();
	
	enum boolean programdaKal = true;
	
 while (programdaKal){
	
	enum boolean tusHareketi = true;
	
	int yatayKonum = -1;
	int j = 0;
	int ekranYukseklik = 15;
	int ekranGenislik = (4*ekranYukseklik)+2;
	int toplamPiksel = ekranGenislik * ekranYukseklik + 1;
	
	char *spiralMatris;
	
		spiralMatris = (char*) malloc(sizeof(char) * toplamPiksel );
	
		for (j = 0;j < toplamPiksel; j++){
	
			*(spiralMatris + j) = j == (toplamPiksel - 1 ) ? '\0' 
			
				:(j % ekranGenislik == 0 || (j+2) % ekranGenislik == 0 ) ? '|'
														
					:((j+1) % (ekranGenislik) == 0) ? '\n' : ' ';	
											      
		}
	
		
		system("CLS");
		printf("%s",spiralMatris);
		tusHareketi = true;
	
	
		while (tusHareketi){
	    
			switch (getch()){
			
				case 'd':
				case 'D':
					if ((yatayKonum % ekranGenislik) < (ekranGenislik -3)) {
				
						system("CLS");
						*(spiralMatris + (yatayKonum + 2)) = '*';
						printf("%s",spiralMatris);
						yatayKonum += 2;
					}
				
					else{
					
						printf("\a");	
					}	
				
					tusHareketi = true;
					break;
			
				case 'a':
				case 'A':
					if ((yatayKonum % ekranGenislik) > 2) {
			    
						system("CLS");
						*(spiralMatris + (yatayKonum - 2)) = '*';
						printf("%s",spiralMatris);
						yatayKonum -= 2;
					}
				
					else{
					
						printf("\a");	
					}
				
					tusHareketi = true;
					break;
			
				case 'w':
				case 'W':
					if ((yatayKonum / ekranGenislik) + 1 > 1) {
				
						system("CLS");
						*(spiralMatris + (yatayKonum - ekranGenislik)) = '*';
						printf("%s",spiralMatris);
						yatayKonum -= ekranGenislik;
					}
				
					else{
					
						printf("\a");
					}
				
						tusHareketi = true;
						break;
			
				case 's':
				case 'S':	
					if ((yatayKonum / ekranGenislik) + 1 < ekranYukseklik) {
					
						system("CLS");
						*(spiralMatris + ( yatayKonum == -1 ? 1 :(yatayKonum + ekranGenislik) ) )= '*';
						printf("%s",spiralMatris);
						yatayKonum += yatayKonum == -1 ? 2 : ekranGenislik;
					}
				
					else{
					
						printf("\a");
					}
				
					tusHareketi = true;
					break;
				
				case 'R':
				case 'r':
					system("CLS");
					tusHareketi = false;
					break;
					
				case 27:
					system("CLS");
					tusHareketi = false;
					programdaKal =false;
					free(spiralMatris);
					break;
				
				default :
					system("CLS");
					break; 
			}
		
		}	
	  
	    free(spiralMatris);
}
	
	return 0;		

}
