def binaryto_(binary):
    blist = list(binary)
    i = 0
    a = 0
    blist.reverse()

    while ( i < len(blist) ):
        x=int(blist[i])
        a = a + (x * (2 ** i))
        i = i + 1

    print (a)


x = input("Binary sayıyı giriniz:")
print ("Girdiğiniz Binary sayının Desimal tabanda karşılığı:")

binaryto_(x)
