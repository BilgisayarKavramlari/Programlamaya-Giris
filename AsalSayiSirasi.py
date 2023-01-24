n = int(input("n sayısını girin: "))

def asalSayiSirasi(x):
    sayi = 2
    sayac = 0
    
    while True:
        for bolen in range(2, sayi):
            if sayi % bolen == 0:
                break
        else:
            sayac += 1
        if sayac == x:
            break
        sayi += 1
        
    return sayi

print(f"{n}. sıradaki asal sayı:", asalSayiSirasi(n))
