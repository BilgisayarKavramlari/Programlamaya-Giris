#include <iostream>
using namespace std;

int main()
{
	int sinir;
	int varsayilanDeger = 1;

	const int satir = 100;
	const int sutun = 100;	
	int tablo[satir][sutun];


	cout << "tablonun satir sayisini giriniz..:";
	cin >> sinir;

	
	for (int j = 0; j < sinir; j++)		// 0. satırın sütünların sütunlarına 1,2,3,4... değerlerini atayan döngü
	{
			tablo[0][j] = varsayilanDeger;
			varsayilanDeger++;
	}

	varsayilanDeger = 1;

	for (int i = 0; i < sinir; i++)		// 0. sütünun satırlarına 1,2,3,4.. değerlerini atayan döngü
	{
		tablo[i][0] = varsayilanDeger;
		varsayilanDeger++;
	}


	for (int i = 1; i < sinir; i++)					// çarpma işlemini yapan döngü
	{
		for (int j = 1; j < sinir; j++)
		{
			tablo[i][j] = tablo[i][0] * tablo[0][j];		// çarpma işleminin algoritması
		}
		
	}

	for (int i = 0; i < sinir; i++)		//tabloyu ekrana yazdıran döngü
	{
		for (int j = 0; j < sinir; j++)
		{
			cout << tablo[i][j]<<" ";
		}
		cout << endl;
	}


	system("pause");

}
