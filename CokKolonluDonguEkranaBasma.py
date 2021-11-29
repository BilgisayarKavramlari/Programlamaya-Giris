a = []
b = []
c = []
d = []

for i in range(1, 101):
    if i % 15 == 0:
        a.append(i)

for i in range(1, 31):
    if i % 5 == 0:
        b.append(i)

for i in range(100, 49, -1):
    if i % 10 == 0:
        c.append(i)

for i in range(2, 65):
    for j in range(1, 7):
        if i == 2 ** j:
            d.append(i)

for i in range(6):
    print(a[i], b[i], c[i], d[i])
