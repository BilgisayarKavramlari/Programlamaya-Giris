dizi=[]
for i in range(1000):

    sayi=input("Sayıyı giriniz.(İşlem bitince boş enter gönderiniz):")

    if(sayi==""):
        break
    dizi.append(sayi)

def geometrik(dizi):
    carpim=1
    for a in range(len(dizi)):
        carpim=carpim*int((dizi[a]))

    n=len(dizi)

    return (round(carpim**(1/n),4))

print("Girdiğiniz dizinin geometrik ortalaması:")
print(geometrik(dizi))

