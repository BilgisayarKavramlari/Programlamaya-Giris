n = int(input("Bir sayı giriniz: "))

for i in range(n):
    for j in range(n-i):
        print(" ", end=" ")
    
    for k in range(i+1):
        print("*", end=" ")
    
    print()
