# II. YÖNTEM
# Girilen sayının Ramanujan Sayısı olup olmadığını kontrol etme.

n = int(input("Bir sayı giriniz: "))

kupler = []
toplam = []
sonuc = []

for i in range(1, int(n ** (1/3))+1):
    kupler.append(i**3)

for i in range(len(kupler)):
    for j in range(len(kupler)):
        toplam.append(kupler[i] + kupler[j])

for sira, sayi in enumerate(toplam, 1):
    if toplam.count(sayi) == 4 and sayi not in sonuc:
        sonuc.append(sayi)

if n in sonuc:
    print(f"Girilen sayı ({n}), 'Ramanujan Sayısı'dır..")
else:
    print(f"Girilen sayı ({n}), 'Ramanujan Sayısı' değildir..")
