int fibonacci(int a){
	
	int i;
	 int fibSerisi[a];
	  fibSerisi[0]=1;
	  fibSerisi[1]=1;
	   
     for (i=2;i<a;i++){
           fibSerisi[i]=fibSerisi[i-2]+fibSerisi[i-1];
	   }
     
  int b=fibSerisi[a-1];
	return b;
}

int main() {

int a;
  printf("Fibonacci serisinin kacinci \n elemanini gorelim :");
   scanf("%d",&a);
 
 int b = fibonacci(a);
  printf("Fibonacci serisinin %d. elemani %d dir",a,b);
}
