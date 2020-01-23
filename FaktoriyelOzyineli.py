def faktoriyel(n):
    if (n == 1):
        return 1
    
    return(n*faktoriyel(n-1))

girdi = input("Bir sayi giriniz :")
girdi = int(girdi)

print(faktoriyel(girdi))
