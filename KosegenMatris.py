
"""
Diagonu 1 olan kare matris
"""
import numpy as np

girdi = input("Bir sayi giriniz : ")

girdi = int(girdi)

liste=np.zeros((girdi,girdi))

liste1=liste.astype(int)

for i in range(girdi):
    
    liste1[i,i] = 1

for i in range(girdi):
    
    for j in range(girdi):
        
        print(liste1[i,j],end = "   ")
        
    print("")
