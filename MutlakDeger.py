dizi = [-7, 3, 2, 5, 0, 20]

i = 0
toplam = 0

while i <= (len(dizi) - 2):
    toplam += abs(dizi[i] + dizi[i+1])
    i += 2

print(f"\nToplam =", toplam)
