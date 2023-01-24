sayi1 = input("Birinci sayıyı girin: ")
sayi2 = input("İkinci sayıyı girin: ")

fark = 0

if len(sayi1) == len(sayi2):
    for i in range(len(sayi1)):
        if sayi1[i] != sayi2[i]:
            fark += 1
else:
    print("Girilen iki sayı birbirine eşit değildir!")

print("Hamming Mesafesi:", fark)
