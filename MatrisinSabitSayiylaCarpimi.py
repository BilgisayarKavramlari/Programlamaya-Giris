# İki Boyutlu Bir Matrisin Skaler Çarpımı

import random

satir = int(input("Matrisin satir sayısını girin: "))
sutun = int(input("Matrisin sütun sayısını girin: "))

n = int(input("Matrisle skaler çarpılacak sayıyı girin: "))

# Boş matrisin oluşturulması
m1 = [[0 for x in range(sutun)] for y in range(satir)]
mc = [[0 for x in range(sutun)] for y in range(satir)]

# m1 matrisine 0 ile 9 arasında rastgele değer atanması
for i in range(satir):
    for j in range(sutun):
        m1[i][j] = random.randint(0, 9)

# Skaler sayının yazdırılması
print("\nSkaler sayı:", n)

# m1 matrisinin yazdırılması
print("\nm1:")
for i in range(satir):
    for j in range(sutun):
        print(m1[i][j], end=" ")
    print()
print()

# Skaler sayı ile m1 matrisinin çarpımı (mc = n x m1)
for i in range(satir):
    for j in range(sutun):
        mc[i][j] = n * m1[i][j]

# mc sonuç matrisinin elde edilmesi
print(f"mc = {n} x m1")

# mc sonuç matrisinin yazdırılması
print("\nmc:")
for i in range(satir):
    for j in range(sutun):
        print(f"{mc[i][j]:>2}", end=" ")
    print()
