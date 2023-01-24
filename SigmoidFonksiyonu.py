sayi = int(input("Bir sayı giriniz: "))

import math

def Sigmoid(x):
    return (1 / (1 + (math.e ** -x)))

print("Sigmoid fonksiyonu =", Sigmoid(sayi))
