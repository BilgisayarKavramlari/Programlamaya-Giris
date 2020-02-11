#include <stdio.h>
#include <math.h>
int main()
{
        int i;
        for(i = 1; i <= 6; i++)
        {
                printf("%d %d %d %.0lf\n", i*15, i*5, (11-i)*10, pow(2,i));
        }
}
