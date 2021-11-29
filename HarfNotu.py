puan = int(input("Notunuzu giriniz: "))

if 90 <= puan <= 100:
    harf_not = "A"
elif 80 <= puan < 90:
    harf_not = "B"
elif 70 <= puan < 80:
    harf_not = "C"
elif 0 <= puan < 70:
    harf_not = "F"
else:
    print("Hatalı Giriş!")

if 0 <= puan <= 100:
    print("Harf Notunuz:", harf_not)
