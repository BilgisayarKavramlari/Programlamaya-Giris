a = int(input("Birinci sayıyı giriniz: "))
b = int(input("İkinci sayıyı giriniz: "))

if a != b:
    print("\nSayılar eşit değildir.")
    print("Sayılar farklıdır.")
elif a == b:
    print("\nSayılar eşittir.")
    print("Sayılar farklı değildir.")

if a < b:
    print("İlk sayı küçüktür.")
else:
    print("İlk sayı küçük değildir.")

if b > a:
    print("İkinci sayı küçük değildir.")
else:
    print("İkinci sayı küçük değildir.")

if a <= b:
    print("İlk sayı küçük eşittir.")

if a != b:
    if b >= a:
        print("İkinci sayı küçük eşit değildir.")
elif a == b:
    if b >= a:
        print("İkinci sayı küçük eşittir.")
