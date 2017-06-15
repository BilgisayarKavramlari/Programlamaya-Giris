def ucret(saat):
    if (saat < 0):
        katsayi = 0
    elif (saat<10):
        katsayi=1
    elif (saat<20):
        katsayi=2
    elif (saat<40):
        katsayi=3
    elif (saat<100):
        katsayi=4
    elif(saat>=100):
        katsayi=5



    return saat*katsayi

saat=int(input("Mesai Saati:"))
print("Mesai ücreti:",ucret(saat))
