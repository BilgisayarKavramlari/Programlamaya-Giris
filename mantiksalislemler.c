#include <stdio.h>
int main()
{
        int x,y;
        printf("Lutfen iki adet sayı giriniz : ");
        scanf("%d%d", &x, &y);
        if(x == y)
                printf("%d = %d\n", x,y);
        else
                printf("%d != %d\n", x,y);
        if(x < y)
                printf("%d < %d\n", x,y);
        else
                printf("%d >= %d\n", x,y);
        if(x > y)
                printf("%d > %d\n", x,y);
        else
                printf("%d <= %d\n", x,y);
}
