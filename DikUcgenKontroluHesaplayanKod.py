a = int(input("Birinci kenarı giriniz: "))
b = int(input("İkinci kenarı giriniz: "))
c = int(input("Üçüncü kenarı giriniz: "))

# Üçgenin dik kenarlarını ve hipotenüsünü karışık sırayla girilme ihtimaline karşı
if a**2 == (b**2) + (c**2) or b**2 == (a**2) + (c**2) or c**2 == (a**2) + (b**2):
    print("Bu bir dik üçgendir.")
else:
    print("Bu bir dik üçgen değildir.")
