#include <stdio.h>
int main(){
	int a[3],i,b,max,min;
	for (i=0;i<3;i++){
		printf("%d rakami giriniz ",i+1);
		scanf("%d",&a[i]);
	}
	printf("En buyuk sayiyi bulmak ichin 1-e basiniz.\n");
	printf("En uchuk sayiyi bulmak ichin 2-e basiniz.");
	scanf("%d",&b);
	switch(b){
		case 1:
			
		
			max=a[0];
			for(i=0;i<3;i++){
				if(a[i]>max){
					max=a[i];
				}
			}
			printf("%d",max);
			break;
		case 2:
			
		
			min=a[0];
			for(i=0;i<3;i++){
				if(a[i]<min){
					min=a[i];
				}
			}
			printf("%d",min);
			break;
		
	}
	
}
