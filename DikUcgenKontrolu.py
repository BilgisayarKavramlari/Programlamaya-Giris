#!/usr/bin/env python
# -*- coding: utf-8 -*-
#python3


def hesapla(*args):
	sirala = sorted(list(args),key=int)
	if (sirala[-1])**2 == (sirala[-2])**2+(sirala[-3])**2:
		return args,"Dik Üçgen."
	else:
		return args,"Dik Üçgen Değil."



kenar1 = int(input("Üçgenin Birinci Kenarını Giriniz: "))
kenar2 = int(input("Üçgenin İkinci Kenarını Giriniz: "))
kenar3 = int(input("üçgenin üçüncü Kenarını Giriniz: "))

print(hesapla(kenar1, kenar2, kenar3))
