dosya = open("veri_dosyasi.txt", "r")
veriler = dosya.read()
dosya.close()

veriler = veriler.replace("\n", " ")
veriler = veriler.split()

print("Binary Number\t-\tDecimal Number")

for sira in range(len(veriler)):
    onluk = int(veriler[sira], 2)
    print(f"{veriler[sira]:>7}\t\t\t-\t\t{onluk:>7}")
    
    """
    OUTPUT:
    
Binary Number	-	Decimal Number
      0				-		      0
      1				-		      1
     10				-		      2
     11				-		      3
    100				-		      4
    101				-		      5
    110				-		      6
    111				-		      7
   1000				-		      8
   1001				-		      9
   1010				-		     10
   1011				-		     11
   1100				-		     12
   1101				-		     13
   1110				-		     14
   1111				-		     15
  10000				-		     16
  10001				-		     17
  10010				-		     18
  10011				-		     19
  10100				-		     20
    """
