sonucdizi=[]
sonuc=0
dizi=[]
c=0
def mutlakdeger(dizi):
    global c,sonuc,sonucdizi

    while c<len(dizi):
        toplam=int(dizi[c])+int(dizi[c+1])
        c+=2

        if (toplam<=0):
            toplam=-toplam
            sonucdizi.append(toplam)

        else:
            sonucdizi.append(toplam)


    for count in range(len(sonucdizi)):
        sonuc=sonuc+sonucdizi[count]

    return sonuc
    return sonucdizi

for i in range(100):
    a=0
    print((i+1),". ikilinin",(a+1),". değerini giriniz:")
    giris=input("")
    if (giris == ""):
         break
    dizi.append(giris)

    print((i + 1), ". ikilinin", (a + 2), ". değerini giriniz:")
    giris = input("")
    dizi.append(giris)

mutlakdeger(dizi)
print("Girdiğiniz ikililerin toplam değerlerinin mutlak değerleri ve onların toplamları:")

print(sonucdizi)
print(mutlakdeger(dizi))


