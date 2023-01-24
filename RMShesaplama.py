n = int(input("RMS hesabı yapacağınız listenin eleman sayısı: "))

sayilar = []
kareler = []

for i in range(n):
    sayi = int(input("Listenin {}. elemanı: ".format(i+1)))
    sayilar.append(sayi)

for i in sayilar:
    kareler.append(i**2)

toplam = 0
for i in kareler:
    toplam += i

ortalama = toplam/n

# Bölme işleminden dolayı tam sayı çıkan sonucu noktalı sayıdan kurtarma
if ortalama == int(ortalama):
    ortalama = int(ortalama)
else:
    ortalama = round(ortalama, 2)

karekok = ortalama ** 0.5

# Kök işleminden dolayı tam sayı çıkan sonucu noktalı sayıdan kurtarma
if karekok == int(karekok):
    karekok = int(karekok)
else:
    karekok = round(karekok, 2)

print("\nSayılar:", *sayilar)
print("Kareleri:", *kareler)
print("Ortalamaları:", ortalama)
print("Karekökü:", karekok)
