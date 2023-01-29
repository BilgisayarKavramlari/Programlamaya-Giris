C = input("Çevirmek istediğiniz sıcaklık değerini Celsius olarak girin: ")

if C.isdecimal():
    C = int(C)
else:
    C = round(float(C), 2)

F = (C * 1.8) + 32

print(f"{C}°C = {F:.2f} °F (Fahrenheit)")
