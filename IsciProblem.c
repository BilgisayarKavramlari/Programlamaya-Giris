#include<cs50.h>
#include<stdio.h>

int main()
{
    int isci;
    int sure;
    int sonuc;
    
    do
    {
        
    printf("bir işçi kaç günde bitirmektedir?:\n");
    scanf("%i",&sure);
    
    printf("toplam işçi sayısını giriniz:\n");
    scanf("%i", &isci);
    
        if (sure <= 0 || isci <= 0)
        {
            
        printf("lütfen değerleri positif tam sayı olarak giriniz\n");
        
        }
        
    }
    while(sure <= 0 || isci <= 0);
    
    sonuc = sure / isci;
    printf("işin bitme süresi %i gündür.\n", sonuc);
    
    return 0;
    
    
}
