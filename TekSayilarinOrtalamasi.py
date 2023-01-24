dizi = [7, 20, 3, 11, 2, 5]

sayac = 0
toplam = 0

for i in range(len(dizi)):
    if dizi[i] % 2 != 0:
        toplam += dizi[i]
        print(dizi[i])
        sayac += 1

print("Tek Sayıların Ortalaması:", toplam / sayac)
