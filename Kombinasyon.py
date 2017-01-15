#!/usr/bin/env python
# -*- coding: utf-8 -*-
#python3

from functools import reduce


def com(n, r):
	if r == 0 or n == r:
		return 1
	else:
		pay = reduce(lambda x, y: x*y, list(range(1, n+1))[::-1][:r])
		payda = reduce(lambda x, y: x*y, list(range(1, r+1)))
		return pay/payda


print(com(15, 4))


