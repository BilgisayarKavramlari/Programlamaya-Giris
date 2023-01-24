n = int(input("Bir sayı giriniz: "))

fibonacci_serisi = []

a = 1
b = 1
c = 0

fibonacci_serisi.append(a)

i = 2   # ilk iki elemanı yazdırdığımız için sayaçı 2'den başlatıyoruz.

while i <= n:
    fibonacci_serisi.append(b)
    i += 1
    c = a + b
    a = b
    b = c

for i in fibonacci_serisi:
    print(i, end=" ")
