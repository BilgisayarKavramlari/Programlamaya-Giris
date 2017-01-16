def fibonacci(z):
    a = 1
    b = 0
    c = 0
    sonuc = []
    for i in range(z):
        c = a+b
        sonuc.append(c)
        a = b
        b = c
    print(sonuc)

sayi = int(input("Bir sayı giriniz: "))
fibonacci(sayi)
