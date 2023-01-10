#include<iostream>
using namespace std;

int main() {

	int i, t, j, k, l, ti = 0, tj = 0, tk = 100, tl = 0;

	for ( t = 0; t < 6; t++)
	{


		for ( i = 1; i < 101; i ++)
		{
			if (i<ti)
			{
				i = ti;
			}
			if (i % 15 == 0)
			{


				cout << i<<" ";
				ti = i+1;
				break;
			}
		}
		for ( j = 1; j < 31; j ++)
		{
			
			if (j < tj)
			{
				j = tj;
			}
			if (j % 5 == 0)
			{


				cout << j<<" ";
				tj = j + 1;
				break;
			}
		}
		for ( k = 100; k > 49; k --)
		{
			if (k >tk)
			{
				k =tk;
			}
			if (k % 10 == 0)
			{

				cout << k<<" ";
				tk = k - 1;
				break;
			}
		}
		for ( l = 2; l < 64; l++)
		{
			if (l < tl)
			{
				l = tl;
			}
			if (l % 2 == 0)
			{


				cout << l<<" ";
				tl = l + l;
				break;
			}
		}
		cout << endl;

	}
	return 0;
}
