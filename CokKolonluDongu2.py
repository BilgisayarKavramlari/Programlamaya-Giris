#öncelikle boş listeleri tanımlıyoruz
seri1= []   #15in katları listesi
seri2= []   #5in katları listesi
seri3= []   #10un kaları listesi
seri4= []   #2nin üsleri listesi

#15in katlarını hesapladık
for n in range(1,101) :
    if n%15==0 :
        seri1.append(n)     #append ile listeye ekledik

#5in katlarını hesapladık
for x in range(1,31) :
    if x%5==0 :
        seri2.append(x) #append ile listeye ekledik

#10un katlarını hesapladık
for i in reversed(range(50,101)) :  #reversed ile aralığı ters çevirdik
    if i%10==0 :
        seri3.append(i) #append ile listeye ekledik

#2-64 arası 2nin katlarını bulduk
for y in range(2,65) :
    for k in range(0,100) :
        if y==2**k :        #burada aralıktaki sayılardan 2nin katlarını bulduk
            seri4.append(y) #append ile listeye ekledik

#kolon şeklinde yazdırmak için:
for z in range(6) : #burada 6yı kendimiz yazmak durumunda kaldık liste olduğu için uzunluğunu alamadık
    print(seri1[z], seri2[z], seri3[z], seri4[z]) #her listenin elemanlarını yan yana yazdırdık

#aliozbek
