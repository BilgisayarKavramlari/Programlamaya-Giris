# Üçgenin birinci dik kenarı
a = int(input("birinci kenar: "))

# Üçgenin ikinci dik kenarı
b = int(input("ikinci kenar: "))

# Hipotenüs
c = (a**2 + b**2) ** 0.5

# Kök alma işleminden dolayı sonucu noktalı sayıdan kurtarma
if c == int(c):
    c = int(c)
else:
    c = round(c, 2)

print("hipotenus:", c)
