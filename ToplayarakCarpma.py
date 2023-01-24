sayi1 = int(input("Birinci sayıyı girin: "))
sayi2 = int(input("İkinci sayıyı girin: "))

def toplayarakCarpma(a, b):
    toplam = 0
    
    for i in range(b):
        toplam += a
    
    return toplam

print(f"\nGirilen {sayi1} ve {sayi2} sayılarının çarpımı:\n\t\
{sayi1} x {sayi2} =", toplayarakCarpma(sayi1, sayi2))
