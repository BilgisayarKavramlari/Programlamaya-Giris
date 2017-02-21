include <stdio.h>
#include <time.h>

int main(void)
{
    time_t simdiki_zaman;
    char* yazdirilacak_simdiki_zaman;
    simdiki_zaman = time(NULL);
    yazdirilacak_simdiki_zaman = ctime(&simdiki_zaman);
    printf("Bugunun tarihi: %s", yazdirilacak_simdiki_zaman);
    
}
