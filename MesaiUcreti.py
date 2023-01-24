saat = int(input("Kaldığınız fazla mesainin saat sayısını giriniz: "))

if saat < 10:
    saat_ucreti = 1
elif 10 <= saat < 20:
    saat_ucreti = 2
elif 20 <= saat < 40:
    saat_ucreti = 3
elif 40 <= saat < 100:
    saat_ucreti = 4
elif saat >= 100:
    saat_ucreti = 5

mesai_ucreti = saat * saat_ucreti

print("Mesai Ücreti:", mesai_ucreti)
