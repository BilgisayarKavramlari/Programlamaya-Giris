sayi = input("1'den büyük bir tam sayı girin: ")

toplam = 0

if sayi.isdecimal():
    if sayi > "1":
        sayi = int(sayi)
        
        for i in range(1, sayi+1):
            toplam += i ** 2
        
        print("Kareler toplamı:", toplam)
        
    else:
        print("Lütfen 1'den büyük bir tam sayı girin!")

elif sayi < "0":
    print("Lütfen pozitif bir tam sayı girin!")
else:
    print("Lütfen tam bir sayı girin!")
