Not = int(input("Notunuzu girin: "))

if Not <= 100 and Not >= 90:
    print("Harf Notunuz: A")
if Not < 90 and Not >= 80:
    print("Harf Notunuz: B")
if Not < 80 and Not >= 70:
    print("Harf Notunuz: C")
if Not < 70 and Not >= 0:
    print("Notunuz: F")
if Not > 100 or Not < 0:
    print("Hatalı giriş")
