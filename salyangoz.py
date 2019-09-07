# by Zafer Cigdem, 07th Sept. 2019

# Soru:
#Verilen boyuttaki bir kare matrisin içerisine salyangoz (helezon) şeklinde
# ardışık sayıları yerleştiriniz.

# Klavyeden girilen sayinin kare matrisini olusturur ve en dış halkadan iç halkalara dogru
# saat yonunde 1 den baslayarak sirali sayilari yazar.
#Ornek: Girilen sayi 3 ise Sonuc: (1,2,3) (8,9,4) (7,6,5)
# (1,2,3)
# (8,9,4)
# (7,6,5)

sagturx=sagtury=0
asagiturx=asagitury=0
solturx=soltury=0
yukariturx=yukaritury=0

l=0
ll=l # loop içinde değiştircem
matrix=[] #bos matrix tanimliyoruz
a = int(input("2 den buyuk bir tam Sayi giriniz: "))
if a>2:
	for i in range(a): #klavyeden girilen sayiye gore kare matris olusturur
	    row=[] 
	    for j in range(a): #boyutu "a"
	        row.append(0) # diziyi 0'lar ile dolduruyoruz
	    matrix.append(row) #bunlari row'un icine koyuyoruz. 

	def SagaYaz(): #saga Yaz fonksiyonu, sagdaki eleman bos oldugu surece yeni eleman yazacak
		global matrix
		global ll
		global sagturx
		global sagtury
		kty=0

		while 1>0:
			if matrix[sagturx][sagtury+kty]==0 and (sagtury+kty)<a:
				matrix[sagturx][sagtury+kty]=ll+1
				ll=ll+1
				if (sagtury+kty)<a-1:
					kty=kty+1
			else:
				break
	#Asagidaki kisim: #birden fazla tur dondugunde yeni lokasyonu icin toplama cikarma yapiyoruz.
	# Yani bir "saga don" turu tamamlanınca x ve y'yi birer arttırmamız gerekiyor. 
	#Benzer sekilde "Sola Don" ve diğerleri icin de bunu yapacagiz.
	
		sagturx=sagturx+1 
		sagtury=sagtury+1
		AsagiYaz()
		
	def AsagiYaz():  #asagi Yaz fonksiyonu, asagidaki eleman bos oldugu surece yeni eleman yazacak
		global matrix
		global ll
		global asagiturx
		global asagitury
		ktx=0

		while 1>0:
			if matrix[1+asagiturx+ktx][a-1+asagitury]==0:
				matrix[1+asagiturx+ktx][a-1+asagitury]=ll+1
				ll=ll+1
				if (1+asagiturx+ktx)<a-1 and (1+asagiturx+ktx)<a-1:
					ktx=ktx+1
			else:
				break
		asagiturx=asagiturx+1
		asagitury=asagitury-1
		SolaYaz()

	def SolaYaz(): #Sola Yaz fonksiyonu, Soldaki eleman bos oldugu surece yeni eleman yazacak
		global matrix
		global ll
		global solturx
		global soltury
		solky=0

		while 1>0:		
			if matrix[a-1+solturx][a-2+solky+soltury]==0 and (a-2+solky+soltury)>=0:
				matrix[a-1+solturx][a-2+solky+soltury]=ll+1
				ll=ll+1
				if (a-2+solky+soltury)<a-1:
					solky=solky-1
			else:
				break
		solturx=solturx-1
		soltury=soltury-1
		YukariYaz()

	def YukariYaz(): #Yukari Yaz fonksiyonu, yukaridaki eleman bos oldugu surece yeni eleman yazacak
		global matrix
		global ll
		global yukariturx
		global yukaritury
		yukariktx=0
		while 1>0:
			if matrix[a-2+yukariturx+yukariktx][0+yukaritury]==0 and 1+yukaritury<a:
				matrix[a-2+yukariturx+yukariktx][0+yukaritury]=ll+1
				ll=ll+1
				yukariktx=yukariktx-1

			else:
				break
		yukariturx=yukariturx-1
		yukaritury=yukaritury+1

		if matrix[0+sagturx][0+sagtury] == 0: #1 tam tur (sag-asagi-sol-yukari) tamamlandiktan sonra devam
		# edilmesi gerekiyor mu, bunun kontrolunu yapar. Evetse, tekrar 1 turun baslamasi icin SagaYaz()
		#fonksiyonunu cagirir
			SagaYaz()
		else:
			print("Sonuc:")

	SagaYaz() # yukaridaki fonksiyonlari bu fonksiyon araciligiyla, domino etkisi gibi cagiriyoruz. 
	print(matrix)
else:
	print("Hatali Giris yaptiniz")
