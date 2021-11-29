# Üçgenin birinci dik kenarı
a = int(input("Birinci kenar: "))

# Üçgenin ikinci dik kenarı
b = int(input("İkinci kenar: "))

# Hipotenüs
c = (a**2 + b**2) ** 0.5

# Kök alma işleminden dolayı sonucu noktalı sayıdan kurtarma
if c == int(c):
    c = int(c)
else:
    c = round(c, 2)

# Dik üçgenin alanı
alan = (a * b) / 2

# Bölme işleminden dolayı sonucu noktalı sayıdan kurtarma
if alan == int(alan):
    alan = int(alan)
else:
    alan = round(alan, 2)

# Dik üçgenin çevresi
cevre = a + b + c

print("Üçgenin alanı:", alan)
print("Üçgenin çevresi:", cevre)
