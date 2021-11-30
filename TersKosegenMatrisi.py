n = int(input("Bir sayı giriniz: "))

for i in range(1, n+1):
    for j in range(n, 0, -1):
        if i == j:
            print(1, end=" ")
        else:
            print(0, end=" ")
    
    print()
