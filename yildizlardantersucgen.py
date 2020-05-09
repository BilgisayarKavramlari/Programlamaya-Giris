a=int(input("Bir Sayı Giriniz: "))
for k in range(a,0,-1):
    print(" "*(k-1), end="")
    print("*"*(a-(k-1)))
