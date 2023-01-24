sayi1 = int(input("Birinci sayıyı giriniz: "))
sayi2 = int(input("İkinci sayıyı giriniz: "))

if sayi1 > sayi2:
    kucuk_sayi = sayi2
else:
    kucuk_sayi = sayi1

for i in range(1, kucuk_sayi+1):
    if sayi1 % i == 0 and sayi2 % i == 0:
        obeb = i

print("OKEK:", (sayi1 * sayi2) // obeb)
