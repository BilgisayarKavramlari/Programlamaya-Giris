dizi = [7, 20, 3, 11, 2, 5, 8]

cift_sayi = []

for i in dizi:
    if i % 2 == 0:
        cift_sayi.append(i)

for i in range(len(cift_sayi)):
    for j in range(i):
        if cift_sayi[i] < cift_sayi[j]:
            cift_sayi[i], cift_sayi[j] = cift_sayi[j], cift_sayi[i]

ortalama = (cift_sayi[0] + cift_sayi[len(cift_sayi)-1]) / 2

print("En büyük ve en küçük çift sayının ortalaması:", ortalama)
