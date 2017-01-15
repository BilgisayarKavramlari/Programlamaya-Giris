
sayi0 = int(input("Birinci sayıyı giriniz: "))#1.sayıyı kullanıcıdan integer olarak istedik
sayi1 = int(input("İkinci sayıyı giriniz: ")) #2.sayıyı kullanıcıdan int olarak istedik

if sayi0 == sayi1:  #Birinci sayi ile İkinci sayının eşitliğini kontrol ediyoruz
    print("\n Sayılar birbirlerine eşittir.\n Sayılar farklı değildir.\n Birinci sayı küçük değildir.") # ters "slash n" bir alt satıra geçmesini sağlar
    print(" İkinci sayı küçük değildir. \n Birinci sayı küçük eşittir.\n İkinci sayi küçük eşittir")

elif sayi0 != sayi1: #Birinci sayi ile İkinci sayının eşitsizliğini kontrol ediyoruz
    print("\n Sayılar eşit değildir.\n Sayılar farklıdır.")
    if sayi0 < sayi1: #Eğer birinci sayı ikinci sayıdan küçük ise bu işlemleri yap
        print(" Birinci sayi küçüktür.\n İkinci sayı küçük değildir.\n Birinci sayı küçük eşittir.")
    elif sayi0 > sayi1: #Eğer ikinci sayı birinci sayıdan küçük ise bu işlemleri yap
        print(" irinci sayı büyüktür.\n İkinci sayı büyük değildir.\n Birinci sayi büyük eşittir.")

