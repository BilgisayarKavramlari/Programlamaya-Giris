#include<iostream>
#include<math.h>
using namespace std;
int main(){
	float carpim=1,geometrikort=0;
int dizi[5]={9,40,7,12,5} ;
for(int i=0;i<5;i++){
	cout<<"dizinin "<<i<<". elemani"<<dizi[i]<<endl;
	carpim*=(float)dizi[i];
}
geometrikort=sqrt(carpim);
cout<<"geometrik ortalama==>"<<geometrikort;
system("pause");
return 0;
