#python3x
#kullanıcıdan verileri input fonksiyonu ile alıyoruz.
#input string aldığı için bunu integer yani tam sayı veri tipine dönüştüreceğiz. İstersek tek satırda istersek iki satırda yapabiliriz.
a=int(input("birinci sayıyı giriniz:\n"))
b=int(input("İkinci sayıyı giriniz:\n"))
print("toplam, {} Çıkarma, {} bölme, {} bölümünden kalan, {} çarpma, {} üssü, {}".format(a+b, a-b, a/b, a%b, a*b, a**b))
#Kaynak tavsiye: https://belgeler.yazbel.com/python-istihza/
