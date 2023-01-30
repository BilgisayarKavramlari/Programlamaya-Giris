# Hazır Fonksiyon Kullanmadan

metin = input("Bir metin girin: ")

bosluk_sayisi = 0

for karakter in metin:
    if karakter == " ":
        bosluk_sayisi += 1

print("\nKelime sayısı:", bosluk_sayisi + 1)

# OUTPUT:
# Bir metin girin: Bugün öğrendim ki teyzeoğlu köye gitmiş, köyde kar yağmış ve ava çıkıp bir tane tavşan vurmuş.

# >>> Kelime sayısı: 16
