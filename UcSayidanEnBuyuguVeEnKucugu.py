a = int(input("Birinci sayıyı giriniz: "))
b = int(input("İkinci sayıyı giriniz: "))
c = int(input("Üçüncü sayıyı giriniz: "))

if a > b and a > c and b > c:
    enbuyuk = a
    enkucuk = c
elif a > b and a > c and c > b:
    enbuyuk = a
    enkucuk = b
elif c > a and c > b and b > a:
    enbuyuk = c
    enkucuk = a
elif c > a and c > b and a > b:
    enbuyuk = c
    enkucuk = b
elif b > a and b > c and a > c:
    enbuyuk = b
    enkucuk = c
elif b > a and b > c and c > a:
    enbuyuk = b
    enkucuk = a

print("En Büyük Sayı:", enbuyuk, "En Küçük Sayı:", enkucuk)
