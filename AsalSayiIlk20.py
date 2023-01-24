print("İlk 20 tane 'Asal Sayı'ların listesi:".format(n))

sayi = 1
sayac = 0

while True:
    for bolen in range(2, sayi):
        if sayi % bolen == 0:
            break
    else:
        print(sayi, end=" ")
        sayac += 1
    
    if sayac == 20:
        break
    
    sayi += 1
