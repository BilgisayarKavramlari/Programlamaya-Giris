a1 = int(input("İlk çiftin birinci sayısını giriniz: "))
a2 = int(input("İlk çiftin ikinci sayısını giriniz: "))
b1 = int(input("İkinci çiftin birinci sayısını giriniz: "))
b2 = int(input("İkinci çiftin ikinci sayısını giriniz: "))

a = a1 ** 3 + a2 ** 3
b = b1 ** 3 + b2 ** 3

if a == b:
    print("""\n{0}^3 + {1}^3 = {2}^3 + {3}^3
   {4}    =    {4}
olduğundan {4} sayısı Ramanujan Sayısı'dır.""".format(a1, a2, b1, b2, a))
else:
    print("""\n{0}^3 + {1}^3 ≠ {2}^3 + {3}^3
   {4}    ≠    {5}
olduğundan {4} sayısı Ramanujan Sayısı'dır.""".format(a1, a2, b1, b2, a, b))
