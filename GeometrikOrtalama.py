dizi = [7, 20, 3, 11, 2, 5]

carpim = 1

for i in range(len(dizi)):
    carpim *= dizi[i]

print("Geometrik Ortalama:", carpim ** (1 / len(dizi)))
