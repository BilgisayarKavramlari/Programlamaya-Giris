def karetoplamlari(n):
    sonuc=0
    if (n>0):
        sonuc = (n**2)+karetoplamlari((n-1))
    return sonuc

n=int(input("Sayıyı giriniz:"))
print(n,". sayıya kadar olan sayıların karelerinin toplamları:",karetoplamlari(n))
