#include <iostream>
using namespace std;

int main() {
    
    
    double a = 0, b = 0, c = 0;
   
    cout << "A sayisini giriniz: ";
    cin >> a;
    cout << "B sayisini giriniz: ";
    cin >>b;
    cout << "C sayisini giriniz: ";
    cin >> c;
    
    double sonuc = (a*a) + (b*b) + (3 *c);
    
    cout << "Sonuc = " << sonuc;
    
    cin.get();
    cin.ignore();
    return 0;
}
