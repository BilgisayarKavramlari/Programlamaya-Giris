#!/usr/bin/env python
# -*- coding: utf-8 -*-
#python3

def hesapla(k1, k2):
	alan = (k1*k2)/2
	cevre = pow(pow(k1, 2) + pow(k2, 2), 1/2) + k1+k2
	return "Üçgenin Alanı: {}\nÜçgenin Çevresi: {}".format(alan, cevre)

kenar1 = int(input("Üçgenin Birinci Dik Kenarını Giriniz: "))
kenar2 = int(input("Üçgenin İkinci Dik Kenarını Giriniz: "))

print(hesapla(kenar1, kenar2))

