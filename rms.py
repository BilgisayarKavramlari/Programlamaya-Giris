import math
def rms(list):
    global karetoplam #biraz da fantazi
    for c in range(count):
        karetoplam = karetoplam + (list[c] ** 2)

    ort = karetoplam / count

    sonuc = round(math.sqrt(ort),3)

    return sonuc


print("Kaç adet giriş yapacaksınız?")
count=int(input(""))
list=[]
karetoplam=0
print("Sayıları giriniz:")
for i in range(count):
    a=int(input(""))
    list.append(a)

print(rms(list))

