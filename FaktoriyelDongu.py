#Python3 için yazılmıştır.
def faktoriyel(sayi):
    sonuc=1
    while sayi>=1:
        sonuc=sonuc*sayi
        sayi-=1
    return sonuc

deger=int(input("Bir sayi giriniz: "))
print("Faktoriyeli: {}".format(faktoriyel(deger)))
