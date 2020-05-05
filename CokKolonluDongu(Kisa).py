onbes = []
bes = []
on = []
ikikuv = []

for i in range(1,101):
    if i % 15 == 0:
        onbes.append(i)
for i in range(1,31):
    if i % 5 == 0:
        bes.append(i)
for i in range(100,49,-1):
    if i % 10 == 0:
        on.append(i)
for i in range(1,7):
        ikikuv.append(pow(2,i))


for k in range(0,6):
    print(onbeskat[k],beskat[k],onkat[k],ikikuv[k])
