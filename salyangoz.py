n = int(input("Kare matrisin n sayısını giriniz: "))

matris = [[0 for x in range(n)] for y in range(n)]

ardisik_sayilar = [x for x in range(1, (n**2)+1)]

satir_basi = 0
satir_sonu = len(matris)
sutun_basi = 0
sutun_sonu = len(matris[0])

sayac = 0

while satir_basi < satir_sonu and sutun_basi < sutun_sonu:
    # Satırın soldan sağa yazdırılması
    for j in range(sutun_basi, sutun_sonu):
        matris[sutun_basi][j] = ardisik_sayilar[sayac]
        sayac += 1
    
    satir_basi += 1
    
    # Sütunun yukarıdan aşağıya yazdırılması
    for i in range(satir_basi, satir_sonu):
        matris[i][sutun_sonu-1] = ardisik_sayilar[sayac]
        sayac += 1
    
    sutun_sonu -= 1
    
    # Satırın sağdan sola yazdırılması
    if satir_basi < satir_sonu:
        for j in range(sutun_sonu-1, sutun_basi-1, -1):
            matris[satir_sonu-1][j] = ardisik_sayilar[sayac]
            sayac += 1
    
    satir_sonu -= 1
    
    # Sütunun aşağıdan yukarıya yazdırılması
    if sutun_basi < sutun_sonu:
        for i in range(satir_sonu-1, satir_basi-1, -1):
            matris[i][sutun_basi] = ardisik_sayilar[sayac]
            sayac += 1
    
    sutun_basi += 1

for i in range(n):
    for j in range(n):
        print(matris[i][j], end="\t")
    
    print()
