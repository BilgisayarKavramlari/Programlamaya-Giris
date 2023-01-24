print("Bugünün tarihini giriniz..")
gun1 = int(input("Gün: "))
ay1 = int(input("Ay: "))
yil1 = int(input("Yıl: "))

print("Doğum tarihinizi giriniz..")
gun2 = int(input("Gün: "))
ay2 = int(input("Ay: "))
yil2 = int(input("Yıl: "))

artik_yil = []

for i in range(yil2, yil1):
    if ((i % 4 == 0 and i % 100 != 0) or i % 400 == 0) and i % 4000 != 0:
        artik_yil.append(i)

aylar = ["ocak", "şubat", "mart", "nisan", "mayıs", "haziran", "temmuz",
         "ağustos", "eylül", "ekim", "kasım", "aralık"]

fazla_aylar = ["ocak", "mart", "mayıs", "temmuz", "ağustos", "ekim", "aralık"]

if gun1 < gun2:
    fark_gun = 30 + gun1 - gun2
    if ay1 < ay2:
        fark_ay = 12 + ay1 - ay2 - 1
        fark_yil = yil1 - yil2 - 1
    else:
        fark_ay = ay1 - ay2 - 1
        fark_yil = yil1 - yil2
else:
    fark_gun = gun1 - gun2
    if ay1 < ay2:
        fark_ay = 12 + ay1 - ay2
        fark_yil = yil1 - yil2 - 1
    else:
        fark_ay = ay1 - ay2
        fark_yil = yil1 - yil2

# 31 gün olan aylar 30 gün hesaplandıysa birer gün eklenecek (toplam 'x' gün)
if fark_ay != 0:
    if aylar[ay1-1] in fazla_aylar:
        x1 = fazla_aylar.index(aylar[ay1-1])
    else:
        x1 = fazla_aylar.index(aylar[ay1])
    
    if aylar[ay2-1] in fazla_aylar:
        x2 = fazla_aylar.index(aylar[ay2-1]) + 1
    else:
        x2 = fazla_aylar.index(aylar[ay2])
    
    # Şubat ayı için 30 gün hesaplandıysa 2 gün düşülecek.
    if ay2 < 3:
        x3 = -2
    else:
        x3 = 0
else:
    x1 = 0
    x2 = 0
    x3 = 0

if ay1 > ay2:
    x = (x1 - x2) + x3
elif ay1 < ay2:
    x = len(fazla_aylar) - (x2 - x1) + x3
else:
    x = 0

fark = (fark_yil * 365) + (fark_ay * 30) + fark_gun + len(artik_yil) + x

print("iki tarih arasında", fark, "gün vardır.")
