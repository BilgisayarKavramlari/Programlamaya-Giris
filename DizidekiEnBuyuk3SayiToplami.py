dizi = [7, 3, 2, 5, 0, 20]

for i in range(len(dizi)):
    for j in range(i):
        if dizi[i] > dizi[j]:
            dizi[i], dizi[j] = dizi[j], dizi[i]

toplam = 0

for i in range(3):
    toplam += dizi[i]

print("Dizinin en büyük 3 sayının toplamı:", toplam)
