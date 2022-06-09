tarih = input("Tarih girin: ")

aylar = ["ocak", "şubat", "mart", "nisan", "mayıs", "haziran", "temmuz",
         "ağustos", "eylül", "ekim", "kasım", "aralık"]

birler = ["", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"]

onlar = ["", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen",
         "doksan"]

gun = int(tarih[:2])
ay = int(tarih[3:5])
yil = tarih[6:]

if gun < 10:
    gun = birler[gun]
elif gun % 10 == 0:
    gun = onlar[int(str(gun)[0])]
else:
    gun = onlar[int(str(gun)[0])] + " " + birler[int(str(gun)[1])]

ay = aylar[ay-1]

yil_int = int(yil)
basamak = 0

while yil_int != 0:
    yil_int //= 10
    basamak += 1

if basamak == 1:
    yil = birler[int(yil)]

elif basamak == 2:
    yil = onlar[int(yil[0])] + " " + birler[int(yil[1])]

elif basamak == 3:
    if yil[0] == "1":
        yil = "yüz" + " " + onlar[int(yil[1])] + " " + \
            birler[int(yil[2])]
    else:
        yil = birler[int(yil[0])] + " " + "yüz" + " " + \
            onlar[int(yil[1])] + " " + birler[int(yil[2])]

elif basamak == 4:
    if yil[0] == "1":
        if yil[1] == "0":
            yil = "bin" + " " + onlar[int(yil[2])] + " " + \
                birler[int(yil[3])]
        elif yil[1] == "1":
            yil = "bin" + " " + "yüz" + " " + \
                onlar[int(yil[2])] + " " + birler[int(yil[3])]
        else:
            yil = "bin" + " " + birler[int(yil[1])] + " " + \
                "yüz" + " " + onlar[int(yil[2])] + " " + \
                    birler[int(yil[3])]
    else:
        if yil[1] == "0":
            yil = birler[int(yil[0])] + " " + "bin" + " " + \
                onlar[int(yil[2])] + " " + birler[int(yil[3])]
        elif yil[1] == "1":
            yil = birler[int(yil[0])] + " " + "bin" + " " + \
                "yüz" + " " + onlar[int(yil[2])] + " " + \
                    birler[int(yil[3])]
        else:
            yil = birler[int(yil[0])] + " " + "bin" + " " + \
                birler[int(yil[1])] + " " + "yüz" + " " + \
                    onlar[int(yil[2])] + " " + birler[int(yil[3])]

print(gun, ay, yil)


"""
OUTPUT:

Tarih girin: 09.06.2022
dokuz haziran iki bin yirmi iki

"""
