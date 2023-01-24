n = int(input("Bir sayı giriniz: "))

for i in range(1, n+1):
    for j in range(i):          # her satırda yazılacak yıldız sayısı
        print("*", end=" ")
    
    print()
