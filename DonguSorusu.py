while True:
    sayi1 = int(input("Birinci sayıyı girin: "))
    sayi2 = int(input("İkinci sayıyı girin: "))
    
    if sayi1 < sayi2:
        m = sayi1
        n = sayi2
        break
    elif sayi1 > sayi2:
        m = sayi2
        n = sayi1
        break
    else:
        print("İki sayıyı aynı girdiniz. Lütfen birbirinden farklı iki sayı \
girin!..")

sayac = 0
toplam = 0

print("\n{} ile {} arasındaki tek sayılar:".format(m, n))

for sayi in range(m, n+1):
    if sayi % 2 == 1:
        sayac += 1
        toplam += sayi
        print(sayi, end=" ")

print("\n\n{} ile {} arasındaki tek sayılar'ın ortalaması:".format(m, n),
      toplam/sayac)
