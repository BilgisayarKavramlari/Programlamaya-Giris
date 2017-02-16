#include <stdio.h>

int main(){
int i,im=0,j,jm=0,k,km=100,u,um,l,lm;
while(i<90||j<30||k>50||u<64){
	
for (i=15;i<100;i++){
	if(i<im){
		i=im;
	}
	printf("%d ",i);
	im=i+15;
	break;
}  

for (j=5;j<30;j++){
	if(j<jm){
		j=jm;
	}
	printf("%d ",j);
	jm=j+5;
	break;
} 
for (k=100;k>50;k--){
	if(k>km){
		k=km;
	}
	printf("%d ",k);
	km=k-10;
	break;
}  
for (u=2;u<64;u++){	
    if(u<um){
    	u=um;
	}
	printf("%d ",u);
	um=u*2;
	break;
}
printf("\n");
}
}
