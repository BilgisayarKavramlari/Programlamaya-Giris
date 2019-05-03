def f(a):
    if a==1:
        return 1
    else:
        sonuc= a*f(a-1)
        return sonuc

n=int(input("Lütfen önce büyük sayıyı giriniz\n Birinci sayı: "))
r=int(input("İkinci sayı: "))

a=f(n)/(f(n-r)*f(r))
print("Kombinasyonu: " + str(int(a)))
