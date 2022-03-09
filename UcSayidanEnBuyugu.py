a = int(input("Birinci sayıyı giriniz: "))
b = int(input("İkinci sayıyı giriniz: "))
c = int(input("Üçüncü sayıyı giriniz: "))

if(a > b and a > c):
    print(f"En büyük sayı {a}")
if(a < b and a < c):
    print(f"En küçük sayı {a}")

if(b > a and b > c):
    print(f"En büyük sayı {b}")
if(b < a and b < c):
    print(f"En küçük sayı {b}")

if(c > a and c > b):
    print(f"En büyük sayı {c}")
if(c < a and c < b):
    print(f"En küçük sayı {c}")
