a = int(input("a musluğu kaç saatte doldurmaktadır: "))
b = int(input("b musluğu kaç saatte doldurmaktadır: "))
c = int(input("c musluğu kaç saatte doldurmaktadır: "))

# 3 musluğun bir havuzu aynı anda doldurma süresi (toplam süre)
bolunen = a * b * c
bolen = b*c + a*c + a*b

if bolunen % bolen == 0:
    toplam_sure = bolunen / bolen
else:
    # Ondalıklı sayıyı kesirli sayıya dönüştürme
    if bolen > bolunen:
        kucuk_sayi = bolunen
    else:
        kucuk_sayi = bolen

    for i in range(1, kucuk_sayi+1):
        if bolen % i == 0 and bolunen % i == 0:
            ebob = i
    
    toplam_sure = "{0}/{1}".format(int(bolunen/ebob), int(bolen/ebob))

print("3 musluk aynı anda açılırsa havuz {} saatte dolar.".format(toplam_sure))
