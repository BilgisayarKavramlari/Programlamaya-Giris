# Matrisin Determinantı (Matrix Determinant)

def determinant(matrix):
    sonuc = 0
    
    if len(matrix) == 1:
        sonuc = matrix[0][0]
        return sonuc
    
    elif len(matrix) == 2:
        sonuc = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0])
        return sonuc
    
    for i in range(len(matrix[0])):
        gecici = [[0 for x in range(len(matrix[0]) - 1)] for y in range(len(matrix) - 1)]
        
        for j in range(1, len(matrix)):
            for k in range(len(matrix[0])):
                if k < i:
                    gecici[j - 1][k] = matrix[j][k]
                elif k > i:
                    gecici[j - 1][k - 1] = matrix[j][k]
        
        sonuc += matrix[0][i] * ((-1) ** i) * determinant(gecici)
    
    return sonuc

a = [[5, 3, 7], [2, 4, 9], [3, 6, 4]]

print("\nA:")
for i in range(len(a)):
    for j in range(len(a[0])):
        print(a[i][j], end=" ")
    print()
print()

for i in range(len(a)):
    if len(a[i]) != len(a):
        print("Kare matris değil!..")
        break
else:
    print("det (A) = |A| =", determinant(a))

# OUTPUT:
A:
5 3 7 
2 4 9 
3 6 4 

det (A) = |A| = -133

# OUTPUT 2:
a = [[1, 2, 1, 3],
     [2, 1, 0, 1],
     [1, 2, 1, 1],
     [3, 4, 0, 1]]

A:
 1  2  1  3 
 2  1  0  1 
 1  2  1  1 
 3  4  0  1 

det (A) = |A| = 10
