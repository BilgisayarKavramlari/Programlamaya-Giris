#include <stdio.h>
int main(){
	int i,j,boyut,q,say=1,a[15][15];
	printf("Matrisin boyutunu giriniz. (Girdiginiz matrisin boyutu 2 ile 15 arasinda olmalidir).\n\n");
	scanf("%d",&boyut);
	printf("\n\n");
	if(boyut>15||boyut<2){
		printf("Girdiginiz rakam 2 ile 15 arasinda digil");
	}
	//tum rakamlari sifirla
	for (i=0;i<boyut;i++){
		for(j=0;j<boyut;j++){
			a[i][j]=0;
		}
		}
	// hepsini dondur	
	for(q=0;q<=boyut/2;q++){
	
	//	1-ci satiri numarala a[0][j]
		for(j=0+q;j<boyut-q;j++){		
			a[0+q][j]=say;
			say++;
		}
	//  sonuncu sutunu numarala a[i][son sutun]
		for (i=1+q;i<boyut-q;i++){
			a[i][boyut-1-q]=say;
			say++;
		}
	//  sonuncu satiri numarala a[son satir][j]
		for (j=boyut-1-q;j>0+q;j--){
			a[boyut-1-q][j-1]=say;
			say++;
		}
	//  1-ci sutunu numarala a[i][0]	
		for (i=boyut-2-q;i>=1+q;i--){
			a[i][0+q]=say;
			say++;
		}
    }  
	// yazdir
	
	for (i=0;i<boyut;i++){
		for(j=0;j<boyut;j++){
			printf("%d\t",a[i][j]);
		}
	printf("\n");
		
	}
}
