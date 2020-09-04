/Created by Oğuz Kaan BULUT.
//All rights reserved.

#include <stdio.h>
#include <time.h>
#include <conio.h>

void main(){
	
	time_t t;

    t = time(NULL);
    printf("Gunun tarih ve saati: %s",ctime(&t));
    
  getch();
}
