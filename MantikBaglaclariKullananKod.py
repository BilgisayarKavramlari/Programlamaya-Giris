a = int(input("Birinci sayıyı (a) giriniz: "))
b = int(input("İkinci sayıyı (b) giriniz: "))
c = int(input("Üçüncü sayıyı (c) giriniz: "))

if a > b and a < c:
    print("a, b ile c arasında bir sayıdır.")
else:
    print("a, b ile c arasında bir sayı değildir.")

if a > b or a > c:
    print("a, b veya c'den daha büyüktür.")
else:
    print("a, b veya c'den daha büyük değildir.")

if  a == b and a < c:
    print("a, b'ye eşit ve aynı zamanda c'den küçüktür.")
else:
    print("a, b'ye eşit ve aynı zamanda c'den küçük değildir..")

if a == b == c:
    print("üç sayı birbirine eşittir.")
else:
    print("üç sayı birbirine eşit değildir.")
