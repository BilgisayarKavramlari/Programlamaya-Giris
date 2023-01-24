n = int(input("Birinci sayıyı giriniz: "))
r = int(input("İkinci sayıyı giriniz: "))

# Faktöriyel hesaplaması için fonksiyon tanımlama
def faktöriyel(n):
    if n == 1:
        return 1
    else:
        return n * faktöriyel(n-1)

# Kombinasyon hesaplama
kombinasyon = faktöriyel(n) / (faktöriyel(r) * faktöriyel(n-r))

# Bölme işleminden dolayı sonucu noktalı sayıdan kurtarma
if kombinasyon == int(kombinasyon):
    kombinasyon = int(kombinasyon)
else:
    kombinasyon = round(kombinasyon, 2)

print("Kombinasyon:", kombinasyon)
