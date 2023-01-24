# Bir işçinin bir işi kaç günde bitirdiği
gun = int(input("Bir işçi işi kaç günde bitirmektedir?: "))

# İşi bitirecek toplam işçi sayısı
isci = int(input("Toplam kaç işçi çalışacak?: "))

# İşin bitirme süresi
x = gun / isci

# Bölme işleminden dolayı sonucu noktalı sayıdan kurtarma
if x == int(x):
    x = int(x)
else:
    x = round(x, 3)

print("İşin bitirme süresi:", x, "gündür.")
