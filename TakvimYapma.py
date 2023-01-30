yil = int(input("Hangi yılın takvimini yapmak istiyorsun: "))
yil_basi = int(input("""1 Ocak hangi güne denk geliyor?

        Pazar         1
        Pazartesi     2
        Salı          3
        Çarşamba      4
        Perşembe      5
        Cumâ          6
        Cumartesi     7

Bir sayı girin: """))

gunler = ["Pa", "Pt", "Sa", "Ça", "Pe", "Cu", "Ct"]

aylar = {"ocak": 31, "şubat": 28, "mart": 31, "nisan": 30, "mayıs": 31,
         "haziran": 30, "temmuz": 31, "ağustos": 31, "eylül": 30, "ekim": 31,
         "kasım": 30, "aralık": 31}

empty = ""

print()
print("*"*20, yil, "*"*20)
print()

baslangic = yil_basi

for ay in aylar:
    print(ay.upper(), yil)
    
    for gun in gunler:
        print(f"{gun:^7}", end="")
    
    print()
    
    for i in range(baslangic-1):
        print(f"{empty:^7}", end="")
    
    ay_sonu = aylar[ay]
    
    # Artık Yıl ilavesi
    if ay == "şubat":
        if ((yil % 4 == 0 and yil % 100 != 0) or yil % 400 == 0) and yil % 4000 != 0:
            ay_sonu += 1
    
    for sayi in range(1, ay_sonu+1):
        print(f"{sayi:^7}", end="")
        
        if (sayi + (baslangic - 1) ) % 7 == 0:
            print()
    
    baslangic = (ay_sonu + (baslangic - 1)) % 7 + 1
    
    print("\n")

"""
OUTPUT:

Hangi yılın takvimini yapmak istiyorsun: 2022

1 Ocak hangi güne denk geliyor?
        
        Pazar         1
        Pazartesi     2
        Salı          3
        Çarşamba      4
        Perşembe      5
        Cumâ          6
        Cumartesi     7

Bir sayı girin: 7

******************** 2022 ********************

OCAK 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                                             1   
   2      3      4      5      6      7      8   
   9     10     11     12     13     14     15   
  16     17     18     19     20     21     22   
  23     24     25     26     27     28     29   
  30     31   

ŞUBAT 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                 1      2      3      4      5   
   6      7      8      9     10     11     12   
  13     14     15     16     17     18     19   
  20     21     22     23     24     25     26   
  27     28   

MART 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                 1      2      3      4      5   
   6      7      8      9     10     11     12   
  13     14     15     16     17     18     19   
  20     21     22     23     24     25     26   
  27     28     29     30     31   

NISAN 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                                      1      2   
   3      4      5      6      7      8      9   
  10     11     12     13     14     15     16   
  17     18     19     20     21     22     23   
  24     25     26     27     28     29     30   


MAYIS 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
   1      2      3      4      5      6      7   
   8      9     10     11     12     13     14   
  15     16     17     18     19     20     21   
  22     23     24     25     26     27     28   
  29     30     31   

HAZIRAN 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                        1      2      3      4   
   5      6      7      8      9     10     11   
  12     13     14     15     16     17     18   
  19     20     21     22     23     24     25   
  26     27     28     29     30   

TEMMUZ 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                                      1      2   
   3      4      5      6      7      8      9   
  10     11     12     13     14     15     16   
  17     18     19     20     21     22     23   
  24     25     26     27     28     29     30   
  31   

AĞUSTOS 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
          1      2      3      4      5      6   
   7      8      9     10     11     12     13   
  14     15     16     17     18     19     20   
  21     22     23     24     25     26     27   
  28     29     30     31   

EYLÜL 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                               1      2      3   
   4      5      6      7      8      9     10   
  11     12     13     14     15     16     17   
  18     19     20     21     22     23     24   
  25     26     27     28     29     30   

EKIM 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                                             1   
   2      3      4      5      6      7      8   
   9     10     11     12     13     14     15   
  16     17     18     19     20     21     22   
  23     24     25     26     27     28     29   
  30     31   

KASIM 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                 1      2      3      4      5   
   6      7      8      9     10     11     12   
  13     14     15     16     17     18     19   
  20     21     22     23     24     25     26   
  27     28     29     30   

ARALIK 2022
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                               1      2      3   
   4      5      6      7      8      9     10   
  11     12     13     14     15     16     17   
  18     19     20     21     22     23     24   
  25     26     27     28     29     30     31   



Şubatın 29 çektiği yı örneği;

******************** 2020 ********************

OCAK 2020
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                        1      2      3      4   
   5      6      7      8      9     10     11   
  12     13     14     15     16     17     18   
  19     20     21     22     23     24     25   
  26     27     28     29     30     31   

ŞUBAT 2020
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
                                             1   
   2      3      4      5      6      7      8   
   9     10     11     12     13     14     15   
  16     17     18     19     20     21     22   
  23     24     25     26     27     28     29   


MART 2020
  Pa     Pt     Sa     Ça     Pe     Cu     Ct   
   1      2      3      4      5      6      7   
   8      9     10     11     12     13     14   
  15     16     17     18     19     20     21   
  22     23     24     25     26     27     28   
  29     30     31   

"""
