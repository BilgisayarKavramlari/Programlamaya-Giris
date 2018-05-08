
# Öncelikle kullanacağımız boş listeleri tanımlıyoruz,
# bu listeleri koşullarımızı sağlayan
# sayıları eklemek için kullanacağız.
# her kolon için bir liste belirledik
a=[]
b=[]
c=[]
d=[]


# blok açıklaması:
# 1'den 100 e kadar sayıları teker teker 15 e böl,
# eğer 15 e bölümünden kalan 0 olan bir sayı olursa; 
# bunu a listesine ekle

for x in range(1,101):

  if x%15==0:
    a.append(x)

# blok açıklaması:
# 1'den 30'a kadar sayıları teker teker 5 e böl,
# eğer 5 e bölümünden kalan 0 olan bir sayı olursa;
# bunu b listesine ekle 

for x in range(1,31):
  
  if x%5==0:
    b.append(x)

# blok açıklaması:
# 100'den 50'e kadar sayıları sırayla 1'er eksilterek teker teker 10' böl,
# eğer 10'a bölümünden kalan 0 olan bir sayı olursa; 
# bunu c listesine ekle

for x in range(100,49,-1):
  
  if x%10==0:
    c.append(x)
    
# 1'den 100'e kadar sayıları (100 değeri 65'i (örnek: 2^7) geçirecek rastgele 
# bir sayı olarak belirlendi) teker teker 2'nin 
# üssü olarak kullan, bu işlemi 2'nin herhangi bir üssü
# 65'i geçinceye kadar devam ettir ve bulduklarını d listesine ekle,
# üs işlemi 65'i geçerse döngüyü kır.
for x in range(1,100):
  if 2**x<65:
    d.append(2**x)
  else:
    break
 
# listeler oluştu, şimdi her bir listenin içeriğini
# ayrı bir döngüyle tek tek arttırıp yazdırıyoruz,
# hocamız kolon olarak talep etmişti, for döngüsü de
# her bir döngüyü bir alt satırda işlemekte olduğundan tablomuzu
# alabileceğiz. Yazdırırken tablo içeriğinin her bir liste de eşit
# olduğunu bildiğimden a listesinin uzunluğunu referans aldım.

for x in range(0,len(a)):
  print(a[x],b[x],c[x],d[x])
