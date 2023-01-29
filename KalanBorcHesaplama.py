odenen_taksit = int(input("Ödediğiniz aylık taksit sayısını girin: "))

taksit_tutari = 581.20
taksit_sayisi = 36

for taksit in range(1, odenen_taksit+1):
    kalan_borc = taksit_tutari * (taksit_sayisi - taksit)
    print(f"{taksit}. aylık ödemenizden sonra kalan borcunuz: {kalan_borc:.2f}₺")
