saat = int(input("Lütfen şimdiki saati giriniz: "))
dakika = int(input("Lütfen şimdiki dakikayı giriniz: "))
fark = int(input("Lütfen farkı dakika olarak giriniz: "))

# Eklenecek saat ve dakikanın tesbiti
saat += fark // 60
dakika += fark % 60

# İstenilen dakikanın hesaplanması
if dakika >= 60:
    saat += 1
    dakika -= 60

# Tek rakamlı dakikanın başına sıfır eklenmesi
if dakika < 10:
    dakika = "0{}".format(dakika)

# İstenilen saat hesaplanması
if saat > 24:
    saat -= 24
elif saat == 24:
    saat = 0

# Tek rakamlı saatin başına sıfır eklenmesi
if saat < 10:
    saat = "0{}".format(saat)

print("Sonuç = {}:{}".format(saat, dakika))
