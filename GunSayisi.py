from datetime import datetime
a = True
while a == True:
    try :    
        dg = input("Lütfen doğum gününüzü GG/AA/YYYY şeklinde giriniz : ")
        dg = datetime.strptime(dg, '%d/%m/%Y')
        ## %a:	hafta gününün kısaltılmış adı
        ## %A:	hafta gününün tam adı
        ## %b:	ayın kısaltılmış adı
        ## %B:	ayın tam adı
        ## %c:	tam tarih, saat ve zaman bilgisi
        ## %d:	sayı değerli bir karakter dizisi olarak gün ##
        ## %j:	belli bir tarihin, yılın kaçıncı gününe denk geldiğini gösteren 1-366 arası bir sayı
        ## %m:	sayı değerli bir karakter dizisi olarak ay ##
        ## %U:	belli bir tarihin yılın kaçıncı haftasına geldiğini gösteren 0-53 arası bir sayı
        ## %y:	yılın son iki rakamı
        ## %Y:	yılın dört haneli tam hali ##
        ## %x:	tam tarih bilgisi
        ## %X:	tam saat bilgisi
        bugun = datetime.today()

        print("Tam olarak ",(bugun-dg).days, "günlüksün :)")
        a = False
    except :
        print("BİÇİM HATASI")
