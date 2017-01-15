
//En Büyük

#include <stdio.h>
#include <conio.h>
 
// Kullanıcının kaç tane sayı girileceği isteniliyor ve bu girilen sayılar arasındaki en büyük sayı bulunuyor        

 
int main(){
    
    int sayi, adet, i;
    int buyuk;
    
    printf("Kac Adet Sayi Girilecek? =  ");
    scanf("%d", &adet);
    
    //Kullanıcının istediği kadar( adet kadar ) sayı girmesini isteyen döngü        
    for(i=0; i<adet; i++){
        
        printf("%d)Sayi Giriniz ", i+1);  //Kullanıcının kaçıncı sayıyı girdiğini görmek için i+1 olarak gösteriyoruz
        scanf("%d", &sayi);
        
        if(i==0){                // Döngü ilk döndüğünde yani i=0 da buyuk değişkenini sayiya eşitliyoruz.
            buyuk = sayi;        // Bu eşitlemeyi yapmazsak eğer karşılaştıracak buyuk değeri olmayacak.
        }
        
        //Döngü ilk defa dönmüyorsa eğer!!!
        else{        
            
            //Buyuk değeri yeni girilen sayidan küçükse en büyük değer o olmadığı için buyuk değerini değiştiriyoruz.
            if(buyuk<sayi){
                buyuk=sayi;
            }
        }        
    }
    
    
    // Ekrana yazdır
    printf("En buyuk sayi= %d", buyuk);
        
    
    getch();
    return 0;
}


//En Küçük
#include <stdio.h>
#include <conio.h>
 
// Kullanıcının kaç tane sayı girileceği isteniliyor ve bu girilen sayılar arasındaki en küçük sayı bulunuyor        

 
int main(){
    
    int sayi, adet, i;
    int kucuk;
    
    printf("Kac Adet Sayi Girilecek? =  ");
    scanf("%d", &adet);
    
    //Kullanıcının istediği kadar( adet kadar ) sayı girmesini isteyen döngü        
    for(i=0; i<adet; i++){
        
        printf("%d)Sayi Giriniz ", i+1);  //Kullanıcının kaçıncı sayıyı girdiğini görmek için i+1 olarak gösteriyoruz
        scanf("%d", &sayi);
        
        if(i==0){                // Döngü ilk döndüğünde yani i=0 da buyuk değişkenini sayiya eşitliyoruz.
            kucuk = sayi;        // Bu eşitlemeyi yapmazsak eğer karşılaştıracak kucuk değeri olmayacak.
        }
        
        //Döngü ilk defa dönmüyorsa eğer!!!
        else{        
            
//Kucuk değeri yeni girilen sayidan büyükse eğer o değeri kucuk değişkenine atar
            if(kucuk > sayi){
                kucuk = sayi;
            }
        }        
    }
    
    
    // Ekrana yazdır
    printf("En kucuk sayi= %d", kucuk);
        
    
    getch();
    return 0;
}
