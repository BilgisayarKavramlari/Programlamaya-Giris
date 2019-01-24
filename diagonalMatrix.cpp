#include <iostream>
using namespace std;
int main()
{
	int satir;

	const int row = 100;
	const int col = 100;
	int matris[row][col];


	cout << "sayi giriniz..:";
	cin >> satir;

	for (int i = 0; i < satir; i++)
	{
		for (int j = 0; j < satir; j++)
		{
			if (i == j)		// köşegenlerin koordinatları satır ve sütunun aynı sayıları aldığı yerler
				matris[i][j] = 1;

			else
				matris[i][j] = 0;

			cout << matris[i][j]<<" ";	
		}
		cout << endl;
	}


	system("pause");

}
