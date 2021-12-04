u = int(input("Bir sayı giriniz: "))

import math

a = math.exp(u)
b = math.exp(-u)

tanh = (a - b) / (a + b)

print("Hiperbolik Tanjant =", tanh)
