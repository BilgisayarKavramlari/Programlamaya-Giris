#include <iostream>
#include <locale.h> //Türkçe Karakter Desteği
using namespace std;

int main() {

	setlocale(LC_ALL, "Turkish"); //Türkçe Karakter Desteği
	int a, b, c;
	cout<<"Birinci Sayıyı (a) Giriniz : "; cin>>a;
	cout<<"İkinci Sayıyı (b) Giriniz : "; cin>>b;
	cout<<"Üçüncü Sayıyı (c) Giriniz : "; cin>>c;
	cout<<endl;

	//a'nın b ve c arasında olup olmadığı
	if (a<b && a>c || a<c && a>b)
		cout<<"a, b ve c arasındadır.";
	else
		cout<<"a, b ve c arasında değildir.";
	cout<<endl;

	//a'nın b'ye eşit ve aynı zamanda c'den küçük olup olmadığı
	if (a==b)
	{
		if (a<c)
			cout<<"a, b'ye eşit ve aynı zamanda c'den küçüktür.";
		else if(a>c)
			cout<<"a, b'ye eşit ve aynı zamanda c'den büyüktür.";
	}
	else if (a!=b)
		cout<<"a, b'ye eşit değildir.";
	cout<<endl;

	//a'nın b'den veya c'den büyük olup olmadığını
	if (a>b || a>c)
		cout<<"a, b veya c'den büyüktür.";
	else
		cout<<"a, b veya c'den küçüktür.";
	cout<<endl;

	//üç sayının birbirine eşit olup olmadığı
	if (a==b && a==c)
		cout<<"Üç sayı birbirine eşittir.";
	else
		cout<<"Üç sayı birbirine eşit değildir.";
	cout<<endl;

	system("pause");
	return 0;
}
