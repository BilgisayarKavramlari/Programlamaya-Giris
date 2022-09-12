harfler = "ABCDEFGHIJKLMNOPRSTUVYZ" # Alfabedeki harfler

harf = input("harf girin = ")     # Kullanıcıdan harf istiyoruz

sayı = harfler.index(harf)   # Kullanıcının girdiği harfin indexini buluyoruz

i = 0
while i < sayı + 1:  # Sayıyı 1 arttırıyoruz çünkü indexleme 0 dan başlıyor
    i += 1
    a = i - 2
    if a == - 1 : # ilk başta a -1 olacağı ve bu tüm stringi tersten yazdıracagı için kontrol yapıyoruz
        print("A")
        continue
    print(f"{harfler[:i]}{harfler[a::-1]}")
# Döngü her çalıştığında i 1 arttığı için her seferinde harfler dizisinde daha ileri gidiyor
# a değişkeni ise ortadaki harf tekrar etmesin diye i den 2 sayı küçük olacak şekilde onu takip ediyor
# ve uygun bir şekilde harfler dizisini tersten yazdırıyor
