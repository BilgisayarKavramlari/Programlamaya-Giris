#include <stdio.h>
int main()
{
        int i,x;
        int eb = 0;
        int ek = 1;
        for(i = 0; i < 3; i++)
        {
                scanf("%d", &x);
                if(x > eb)
                        eb = x;
                if(ek == 1)
                        ek = x;
                else if(x < ek)
                        ek = x;
        }
        printf("En buyuk sayi : %d", eb);
        printf("En kucuk sayi : %d", ek);
}
