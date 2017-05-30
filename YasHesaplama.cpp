#include <iostream>
using namespace std;


int main() {
    
    
    int buYil = 0, dogumYili = 0;
    bool check = 1, check2 =2;
    while(check2){
        
    while(check){
        
        cout << "Hangi yilda oldugumuzu giriniz: " ;
        cin >> buYil;
        if(buYil > 0) {
            check = 0;
        }
        else if(buYil <= 0) {
            
            cout << "Bu deger pozitif olmalidir" << endl;
            
        }
        
    }
    
    check = 1;
    while(check){
        
        cout << "Dogdugunuz yili giriniz: " ;
        cin >> dogumYili;
        if(dogumYili > 0) {
            check = 0;
        }
        else if(dogumYili <= 0) {
            
            cout <<  "Bu deger pozitif olmalidir" << endl;
            
        }
        
    }
    check = 1;
        
        if(buYil <= dogumYili){
            
            cout << "Bulundugumuz yil dogum gununuzden kucuk olamaz." << endl;
            
        }
        else {
            
            check2 = 0;
            
        }
    }
    
    double sonuc = (buYil) - (dogumYili);
    
    cout << "Yasiniz: " << sonuc << endl;
    
    cin.get();
    cin.ignore();
    return 0;
}
