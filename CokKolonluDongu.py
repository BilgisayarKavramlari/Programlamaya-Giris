"""
yüklenen diğer örnekten farklı olarak
önce kolon kolon verileri elde edip
daha sonra satırlara geçirdim
"""
onbeskat = []
beskat = []
onkat = []
ikiussu = []

for i in range(1, 101):  # birinci kolon
    if i % 15 == 0:
        onbeskat.append(i)

for k in range(1, 31):  # ikinci kolon
    if k % 5 == 0:
        beskat.append(k)

for l in range(50, 101):  # üçüncü kolon
    if l % 10 == 0:
        onkat.insert(0, l)  # siralamayi büyükten küçüğe yapmak için sayıları sırayla listenin başına ekliyoruz

n = 1
while n <= 10:  
    """ buradaki sayının büyüklüğü önemli değil 
    zaten 64'e kadar yazdırmak istediğimizden
     6'dan büyük bir sayı yazmamız yeterli """
    a = pow(2, n)
    if a <= 64:
        ikiussu.append(a)
        n += 1
    else:
        break

veriler = []

for eleman in range(6):  # altı satır var
    for liste in [onbeskat, beskat, onkat, ikiussu]:
        veriler.append(liste[eleman])
        
""" 
burada biraz kolaya kaçtım
aslında yapmak istediğim sütunlardaki verileri
tek tek okuyarak ayrı satırlara dönüştürmekti
fakat böyle yazdırmak daha kolay :)
"""

print(veriler[:4])
print(veriler[4:8])
print(veriler[8:12])
print(veriler[12:16])
print(veriler[16:20])
print(veriler[20:24])
