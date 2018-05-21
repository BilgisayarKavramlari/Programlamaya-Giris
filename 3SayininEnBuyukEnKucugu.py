x = int(input('İlk sayıyı giriniz: '))
y = int(input('İkinci sayıyı giriniz: '))
z = int(input('Üçüncü sayıyı giriniz: '))

eb = ek = x
for n in x,y,z:
    if n > eb:
        eb = n
    if n < ek:
        ek = n

print('''
    En büyük : {}
    En küçük : {}'''.format(eb,ek))
