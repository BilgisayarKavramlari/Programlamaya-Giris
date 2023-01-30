isim = input("İsmi girin: ")

liste = isim.split()

for i in liste:
    print(i)

for i in range(len(liste)):
    print(liste[i][0].upper(), end="")
