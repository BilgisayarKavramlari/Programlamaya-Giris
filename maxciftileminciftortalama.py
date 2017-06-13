dizi=[]
ciftsayilar=[]

for i in range(100):
    sayi=input("Sayıları giriniz(Giriş işlemi bitince boş enter gönderiniz.")
    if(sayi==""):
        break
    dizi.append(sayi)



def fonksiyon(dizi):
    for a in range(len(dizi)):
        if((int(dizi[a]))%2==0):
            ciftsayilar.append(dizi[a])
        else:
            pass


    ciftsayilar.sort()



    a=int(ciftsayilar[0])


    ciftsayilar.reverse()


    b=int(ciftsayilar[0])

    return ((a+b)/2)


print("Dizideki çift sayılardan en büyük ve en küçüğün ortalaması:")
print(fonksiyon(dizi))
