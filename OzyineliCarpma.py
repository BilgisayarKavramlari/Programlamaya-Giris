sayi1 = int(input("Birinci sayıyı girin: "))
sayi2 = int(input("İkinci sayıyı girin: "))

def ozyineliCarpma(a, b):
    if b == 0:
        return 0
    
    return a + ozyineliCarpma(a, b-1)

print(f"\nGirilen iki sayının çarpımı:\n\t\
{sayi1} x {sayi2} =", ozyineliCarpma(sayi1, sayi2))
