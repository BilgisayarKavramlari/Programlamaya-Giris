#include <stdio.h>
int main()
{
	char alphabet[26] = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	char n;
	int i,j,k;
	scanf("%c",&n);
	if (n>=97)  n=n-97;
	else		n=n-65;

	for(i=1;i<=n+1;i++)
	{
		for(j=0;j<i;j++)
		{
			printf ("%c",alphabet[j]);
		}
			if(i>1)
			{
				for (k=i-2;k>=0;k--)
				{
					printf("%c",alphabet[k]);
				}
			}
		printf("\n");
	} 
return 0;
}
