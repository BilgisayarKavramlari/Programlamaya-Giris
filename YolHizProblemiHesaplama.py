x = int(input("Mesafeyi giriniz: "))
v = int(input("Hızı giriniz: "))

# Hareket formülüne göre (x = v.t)
t = x / v

# Bölme işleminden dolayı sonucu noktalı sayıdan kurtarma
if t == int(t):
    t = int(t)
else:
    t = round(t, 2)

print("Süre:", t, "saattir.")
