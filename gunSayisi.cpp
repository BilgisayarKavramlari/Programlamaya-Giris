#include <iostream>
using namespace std;

struct Date
{
    int d, m, y;
};

const int monthDays[12] = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};

int countLeapYears(Date d)
{
    int years = d.y;
    
    
    if (d.m <= 2)
        years--;
    
    return years / 4 - years / 100 + years / 400;
    
}

int getDifference(Date dt1, Date dt2)
{
    
    long int n1 = dt1.y*365 + dt1.d;
    

    for (int i=0; i<dt1.m - 1; i++)
        n1 += monthDays[i];
    
    
    n1 += countLeapYears(dt1);
    
    
    long int n2 = dt2.y*365 + dt2.d;
    for (int i=0; i<dt2.m - 1; i++)
        n2 += monthDays[i];
    n2 += countLeapYears(dt2);
    
    return (n2 - n1);
}

int main() {
    
    int d1, m1, y1;
    int d2, m2, y2;
    
    cout << "Ilk tarihi gun, ay, yil seklinde, sayi olarak arada bir bosluk kalacak sekilde giriniz: ";
    cin >> d1;
    cin >> m1;
    cin >> y1;
    cout << "Ikinci tarihi gun, ay, yil seklinde, sayi olarak arada bir bosluk kalacak sekilde giriniz: ";
    cin >> d2;
    cin >> m2;
    cin >> y2;
    
    Date dt1 = {d1, m1, y1};
    Date dt2 = {d2, m2, y2};
    
    cout << "Iki tarih arasindaki gun sayisi " << getDifference(dt1, dt2);

    
    cin.get();
    cin.ignore();
    return 0;
}
