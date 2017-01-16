#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	double kenar1, kenar2, hipotenus;
	cout << "Birinci kenari giriniz: "; cin >> kenar1;
	cout << "Ikinci kenari giriniz: "; cin >> kenar2;
	hipotenus = sqrt((kenar1*kenar1) + (kenar2*kenar2));
	cout << "Ucgenin alani: " << (kenar1*kenar2) / 2 << endl;
	cout << "Ucgenin cevresi: " << kenar1 + kenar2 + hipotenus;
	return 0;
}
