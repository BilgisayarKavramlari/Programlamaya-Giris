dizi=[]
ciftsayilar=[]

for i in range(100):
    sayi=input("Sayıları giriniz(Giriş işlemi bitince boş enter gönderiniz.):")
    if(sayi==""):
        break
    dizi.append(sayi)



def fonksiyon(dizi):
    dizi.sort()

    a=int(dizi[0])+int(dizi[1])+int(dizi[2])

    return a


print("Dizideki en büyük üç sayının toplamı:")
print(fonksiyon(dizi))
