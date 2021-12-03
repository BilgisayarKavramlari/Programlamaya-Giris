n = int(input("Bir sayısı giriniz: "))

def faktöriyel(f):
    carpim = 1
    
    for i in range(1, f+1):
        carpim *= i
    
    return carpim
    
print("Faktöriyeli:", faktöriyel(n))
