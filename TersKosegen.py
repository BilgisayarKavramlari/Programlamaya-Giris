def anti_diagonal(sayi):
    a = sayi-1
    for k in range(sayi):
        satir = []
        for i in range(sayi-1):
            satir.append(0)
        satir.insert(a, 1)
        a -= 1
        print(satir)

sayi = int(input("Bir sayı giriniz: "))
anti_diagonal(sayi)
