dizi = [7, 20, 3, 11, 2, 5]

for i in range(len(dizi)):
    for j in range(i):
        if dizi[i] < dizi[j]:
            dizi[i], dizi[j] = dizi[j], dizi[i]

fark = dizi[len(dizi)-1] - dizi[0]

print("Dizideki en büyük ve en küçük sayıları farkı:", fark)
