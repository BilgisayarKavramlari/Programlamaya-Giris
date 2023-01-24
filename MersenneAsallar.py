sayi1 = 1
sayac = 0

print("'Mersenne Asallar'ın ilk 8 tanesinin listesi:")

while True:
    sayi1 += 1
    for bolen in range(2, sayi1):
        if sayi1 % bolen == 0:
            break
    else:
        sayi2 = 2**sayi1 - 1
        for bolen2 in range(2, sayi2):
            if sayi2 % bolen2 == 0:
                break
        else:
            print(sayi2, end=" ")
            sayac += 1
    
    if sayac == 8:
        break
