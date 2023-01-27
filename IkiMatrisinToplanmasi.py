# İki Boyutlu İki Matrisin Toplanması (Boyutları Eşit)

import random

# Kullanıcıdan iki matris için satır ve sütun sayıları girdiriliyor
satir = int(input("Matrisin satir sayısını girin: "))
sutun = int(input("Matrisin sütun sayısını girin: "))

# Boş matrislerin oluşturulması
m1 = [[0 for x in range(sutun)] for y in range(satir)]
m2 = [[0 for x in range(sutun)] for y in range(satir)]
mt = [[0 for x in range(sutun)] for y in range(satir)]

# Oluşturulan boş matrislerin yazdırılması
print("\nBoş oluşturulan m1, m2 ve mt matrisler;")
print("m1:")
for i in range(satir):              # boş m1 matrisi yazdırılıyor
    for j in range(sutun):
        print(m1[i][j], end=" ")
    print()
print()

print("m2:")
for i in range(satir):              # boş m2 matrisi yazdırılıyor
    for j in range(sutun):
        print(m2[i][j], end=" ")
    print()
print()

print("mt:")
for i in range(satir):              # boş mt matrisi yazdırılıyor
    for j in range(sutun):
        print(mt[i][j], end=" ")
    print()
print()

# m1 matrisine 0 ile 9 arasında rastgele değer atanması
for i in range(satir):
    for j in range(sutun):
        m1[i][j] = random.randint(0, 9)

# m2 matrisine 0 ile 9 arasında rastgele değer atanması
for i in range(satir):
    for j in range(sutun):
        m2[i][j] = random.randint(0, 9)

# m1 ve m2 matrisinin toplanıp mt matrisine atanması (mt = m1 + m2)
for i in range(satir):
    for j in range(sutun):
        mt[i][j] = m1[i][j] + m2[i][j]

# m1 matrisinin yazdırılması
print("Değer atandıktan sonra m1:")
for i in range(satir):
    for j in range(sutun):
        print(m1[i][j], end=" ")
    print()
print()

# toplama işareti
print("+\n")

# m2 matrisinin yazdırılması
print("Değer tanadıktan sonra m2:")
for i in range(satir):
    for j in range(sutun):
        print(m2[i][j], end=" ")
    print()
print()

# eşittir işareti
print("=\n")

# mt sonuc matrisinin yazdırılması
print("m1 ve m2 matrisini toplandıktan sonra (mt = m1 + m2)\nmt:")
for i in range(satir):
    for j in range(sutun):
        print(f"{mt[i][j]:>2}", end=" ")
    print()
