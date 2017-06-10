dizgi1=input("İlk dizgiyi giriniz:")
dizgi2=input("İkinci dizgiyi giriniz:")

hamming=0
i=0
dizgi11=list(dizgi1)
dizgi22=list(dizgi2)

while i < len(dizgi11):
    if dizgi11[i] != dizgi22[i]:
        hamming=hamming+1
    i=i+1
    
    
print ("Hamming Mesafesi:")
print (hamming)

