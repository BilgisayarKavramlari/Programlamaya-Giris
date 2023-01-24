a = [[1, 0, 1],
     [0, 2, 1],
     [1, 1, 1]]

print("A matrisi:")

for i in range(len(a)):
    for j in range(len(a)):
        print(f"{a[i][j]:>2}", end=" ")
    
    print()

b = [[0 for x in range(len(a))] for y in range(len(a))]

for i in range(len(a)):
    for j in range(len(a)):
        if i == j:
            b[i][j] = 1
        else:
            b[i][j] = 0

print("\nBirim matris (I):")

for i in range(len(b)):
    for j in range(len(b)):
        print(f"{b[i][j]:>2}", end=" ")
    
    print()

ver_bar = [["|" for x in range(1)] for y in range(len(a))]

c = [[0 for x in range((len(a)*2)+1)] for y in range(len(a))]

print("\n(A|I):")

for i in range(len(a)):
    c[i] = a[i] + ver_bar[i] + b[i]

for i in range(len(c)):
    for j in range(len(c[i])):
        print(f"{c[i][j]:>2}", end=" ")
    
    print()

for i in range(len(a)):
    d = a[i][i]
    
    for j in range(len(a)):
        a[i][j] = a[i][j] / d
        b[i][j] = b[i][j] / d
    
    for k in range(len(a)):
        if k != i:
            e = a[k][i]
            
            for l in range(len(a)):
                a[k][l] = a[k][l] - (a[i][l] * e)
                b[k][l] = b[k][l] - (b[i][l] * e)

print("\nMatrisin Tersi (A^-1):")

for i in range(len(b)):
    for j in range(len(b)):
        print(f"{round(b[i][j], 3):>6}", end="\t")
    
    print()
