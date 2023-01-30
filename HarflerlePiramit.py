harf = input("Harf girin: ").upper()

alfabe = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",\
          "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

sira = alfabe.index(harf)

for i in range(sira+1):
    print(alfabe[0], end="")
    
    for j in range(i):
        print(alfabe[j+1], end="")
    
    for k in range(i-1, -1, -1):
        print(alfabe[k], end="")
    
    print()
