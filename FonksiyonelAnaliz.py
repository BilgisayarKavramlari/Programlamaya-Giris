harf = input("Harfi girin: ").lower()

eng_harfler = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
               "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
tr_karakter = ["ç", "ğ", "ı", "ö", "ş", "ü"]

if not harf in tr_karakter:
    if harf in ["a", "b", "c"]:
        deger = 2
    elif harf in ["d", "e", "f"]:
        deger = 3
    elif harf in ["g", "h", "i"]:
        deger = 4
    elif harf in ["j", "k", "l"]:
        deger = 5
    elif harf in ["m", "n", "o"]:
        deger = 6
    elif harf in ["p", "r", "s"]:
        deger = 7
    elif harf in ["t", "u", "v"]:
        deger = 8
    elif harf in ["w", "x", "y", "z"]:
        deger = 9
    else:
        print("Yanlış karakter girdiniz!..")
    
    if harf in eng_harfler:
        print(f"{harf.upper()} harfi telefonda {deger} rakamına karşılık gelir.")

else:
    print("Lütfen Türkçe karakter girmeyin!")
