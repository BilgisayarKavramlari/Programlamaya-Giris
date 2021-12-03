sayi = int(input("Bir sayı giriniz: "))

def faktöriyel(n):
    if n == 1:
        return 1
    else:
        return n * faktöriyel(n-1)
    
print("Faktöriyeli:", faktöriyel(sayi))
