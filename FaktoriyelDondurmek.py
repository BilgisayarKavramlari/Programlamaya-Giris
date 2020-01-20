faktoriyel=1
while(True):
    sayı=int(input("Faktoriyeli alınacak sayıyı giriniz: "))
    if (sayı<0):
        print("Lütfen negatif sayı girmeyiniz.")
    else:
        for i in range(1,sayı+1):
            faktoriyel*=i
        print("Faktoriyel:",faktoriyel)
        break
