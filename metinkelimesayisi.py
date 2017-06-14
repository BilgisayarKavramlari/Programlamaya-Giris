def say(metin):
    dizgi=list(metin)


    for i in range(dizgi.count(" ")):
        dizgi.remove(" ")


    print("\nGirdiğiniz metindeki harf sayısı(Boşluklar dahil edilmemiştir):",len(dizgi))



giris=input("Metini giriniz:")
say(giris)


