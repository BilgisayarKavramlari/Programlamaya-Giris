def ramanujan(a,b,c,d):
    if((a**3)+(b**3)==(c**3)+(d**3)):
        return True
    else:
        return False


print ("İlk sayı çiftini giriniz:")
a=int(input(""))
b=int(input(""))

print ("İkinci sayı çiftini giriniz:")
c=int(input(""))
d=int(input(""))

if(ramanujan(a,b,c,d)==True):
    print("\n\nGirdiğiniz sayılar Ramanujan sayılarıdır.")
else:
    print("\n\nGirdiğiniz sayılar Ramanujan sayısı değildir.")
