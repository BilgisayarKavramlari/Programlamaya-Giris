a=int(input('ilk sayıyı giriniz:',))        #ilk sayı alınır
b=int(input('ikinci sayıyı giriniz:',))      #ikinci sayı alınır
c=int(input('üçüncü sayıyı giriniz:',))       #üçüncü sayı alınır

if b<a<c or c<a<b:                      #or bağlacı kullanılır iki ihtimalde olabilir
    print ('a, b ve c arasındadır')
else:
    print('a, b ve c arasında değildir.')

if a==b and a<c:                            #and bağlacı ile bileşke bulunur
    print ('a, b\'ye eşit ve c\'den küçüktür.')
else:
    print ('a, b\'ye eşit değil ve c\'den küçük değildir.')

if a>b or a>c:
    print('a, b veya c\'den büyüktür.')
else:
    print('a, b veya c\'den daha büyük değildir.')

if a==b==c :
    print('üç sayı birbirine eşittir.')
else:
    print ('üç sayı birbirine eşit değildir.')

#aliozbek
