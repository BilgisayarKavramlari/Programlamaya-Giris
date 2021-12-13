n = input("Binary (1 ve 0'lardan oluşan) bir sayı giriniz: ")

sayi = 0
sayac = len(n) - 1

for i in range(len(n)):
    sayi += int(n[sayac]) * (2 ** i)
    sayac -= 1

print("10'luk tabanındaki karşılığı:", sayi)
