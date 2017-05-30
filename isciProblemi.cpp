#include <iostream>
using namespace std;

int main() {
    
    
    double isci = 0, sure = 0;
    bool check = 1;
    
    while(check){
        
        cout << "Bir isci bu isi kac gunde bitirmektedir?: " ;
        cin >> sure;
        if(sure > 0) {
            check = 0;
        }
        else if(sure <= 0) {
            
            cout << "Bu deger pozitif olmalidir" << endl;
            
        }
        
    }
    
    check = 1;
    while(check){
        
        cout << "Toplam isci sayisini giriniz. " ;
        cin >> isci;
        if(isci > 0) {
            check = 0;
        }
        else if(isci <= 0) {
            
            cout <<  "Bu deger pozitif olmalidir" << endl;
            
        }
        
    }
    
    double sonuc = (sure) / (isci);
    
    cout << "Isin bitme suresi " << sonuc << " gundur";
    
    cin.get();
    cin.ignore();
    return 0;
}
