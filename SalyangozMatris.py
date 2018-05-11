"""
-----------------------
SALYANGOZ MATRİS
-----------------------
Matrisi yazdırmada kullanılan araçlar:

-if
-for
-while
-print
-break

----------------------
Yazdırırken kullanacağım yöntem

Salyangoz matris esas itibarı ile her bir dış kareyi saat yönünde
yazdırmayı tamamladıktan sonra bir iç karede başa dönen bir
döngüye sahiptir. Bu kareleri yazdırmak için "while" döngüsü 
kare içerisindeki her bir kenarı yazdırmak için "for" döngüsü
kullanacağım.

örn:
(5x5)
(her sayı kullanılacak kenar döngüsünün adını taşımaktadır)

  1  1  1  1  1

  4  1  1  1  2

  4  4  1  2  2

  4  3  3  3  2

  3  3  3  3  3

"""


ebat=int(input("Yazdırmak istediğiniz salyangoz matris için bir boyut giriniz: "))

sonuc=[]

# İçerisine sayıları yerleştireceğimiz...
# ...istenilen ebatlarda bir sıfır matris
for x in range(0,ebat):
    sonuc.append([0 for x in range(0,ebat)])

# Değişkenler
say=1
matrisbas=0
matriskenar=ebat-1


# Saat yönünde kareyi yazmayı tamamlamlar ve...
# ...bir içerideki kare için değişkenleri düzenler...
# ...sayı adedi ebat'ın karesini geçerse döngüyü kırar...
# ...not: Toplam yazılacak sayı, ebat'ın karesine eşittir.
while say<((ebat**2)+1):
    
    
    # Birinci kenar 
    for x in range(matrisbas,matriskenar+1):
        #kareyi yazarken 
        if say==(ebat**2)+1:
            break
        sonuc[matrisbas][x]=say
        say+=1


    # İkinci kenar        
    for x in range(matrisbas+1,matriskenar):
        if say==(ebat**2)+1:
            break
        sonuc[x][matriskenar]=say
        say+=1

    
    # Üçüncü kenar    
    for x in range(matriskenar,matrisbas-1,-1):
        if say==(ebat**2)+1:
            break
        sonuc[matriskenar][x]=say
        say+=1

    
    # Dördüncü kenar    
    for x in range(matriskenar-1,matrisbas,-1):
        if say==((ebat**2)+1):
            break
        sonuc[x][matrisbas]=say
        say+=1
 
    matrisbas+=1
    matriskenar-=1


#Listeyi matris şeklinde yazdırma    
for x in range(0,ebat):
    
   print(sonuc[x], end="\n")
