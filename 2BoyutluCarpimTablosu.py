print("Çarpım tablosu boyutunu giriniz. Örneğin 5 x 5 boyutundaki tablo için \
5 girmeniz yeterli.")

n = int(input("Boyutu: "))

for i in range(1, n+1):              # satır sayısı
    for j in range(1, n+1):          # sütun sayısı
        print(i * j, end="\t")
    
    print()
