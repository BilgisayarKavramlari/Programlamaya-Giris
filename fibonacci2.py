sayi= int(input('Bir sayı giriniz:',))

a,b=1,1     #fibonacci başlangıç elemanları
for i in range(0,sayi): #for döngüsünü girilen değer kadar tekrarlatıyoruz
        print(a)
        a,b=b,a+b   #her tekrarda a ve b yi güncelliyor

#aliozbek
