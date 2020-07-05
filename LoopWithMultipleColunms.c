#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
    
    
    int list[6][4];
    int col1 = 0;
    int x = 0;
    int y = 0;
    
    for(int i = 1; i <= 100; i ++){
       
        if(i % 15 == 0){
            
            list[col1][0] = i;
            col1 += 1;
        }
    }
    col1 = 0;
    for(int i = 1; i <= 30; i ++){
        
        if(i % 5 == 0){
            list[col1][1] = i;
            col1 += 1;
        }
    }
    col1 = 0;
    for(int i = 100; i >=50; i--){
        
        if(i % 10 == 0){
            list[col1][2] = i;
            col1 += 1;
        }
    }
    col1 = 0;
    for(int i = 1; i <=6; i++){
        list[col1][3] = pow(2,i);
        col1 += 1;
    }

 
    for (int i = 0; i <=24; i++){
        
        if (x < 3){
            printf("%d ",list[y][x]);
        }
        x +=1;
        if (x == 3) {
             printf("%d  \n ",list[y][x]);
        }
        
        if (x >=3) {
            x = 0;
            y +=1;
        }

        if (y >= 6 ) {
            break;
        }
    }
}



