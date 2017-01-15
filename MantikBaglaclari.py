
sayi0 = int(input("Birinci sayıyı giriniz: "))            # 1.sayıyı kullanıcıdan integer olarak istedik
sayi1 = int(input("İkinci sayıyı giriniz: "))             # 2.sayıyı kullanıcıdan int olarak istedik
sayi2 = int(input("Üçüncü sayıyı giriniz: "))             # 3.sayıyı kullanıcıdan int olarak istedik

if sayi0 == sayi1 == sayi2:                               # 3 sayıda birbirine eşitse bu işlemi yap
    print("Üç sayı birbirine eşittir.")
elif sayi0 < sayi1 and sayi0 > sayi2:                     # 'and' operatörü iki koşuluda sağladığında işlemi gerçekleştir demektir.
    print("1.sayı 2. ve 3. sayıların arasındadır.")
elif sayi0 == sayi1 and sayi0 < sayi2:
    print("1.sayı 2. sayıya eşittir ve 3.sayıdan küçüktür.")
elif sayi0 < sayi1 or sayi0 < sayi2:
    print("1.sayı 2.sayıdan veya 3.sayıdan küçüktür.")
    
    #feyyazonur
