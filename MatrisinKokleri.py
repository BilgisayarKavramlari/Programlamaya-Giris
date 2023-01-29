# Matrisin Köklerini Bulma

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

# x1 - 2x2 + x3 = -1
# 2x1 + x2 - 3x3 = 8
# 3x1 - 2x2 + 2x3 = 2

# Katsayılar Matrisi (A)
A = [[1, -2, 1],
     [2, 1, -3],
     [3, -2, 2]]

# Katsayılar Matrisi'nin yazdırılması
print("\nA:")
for i in range(len(A)):
    for j in range(len(A[0])):
        print(f"{A[i][j]:>2}", end=" ")
    print()
print()

# Bilinmeyenler Sütun Matrisi (X)
X = [["x1"],
     ["x2"],
     ["x3"]]

# Bilinmeyenler Sütun Matrisi'nin yazdırılması
print("X:")
for i in range(len(X)):
    for j in range(len(X[0])):
        print(f"{X[i][j]:>2}", end=" ")
    print()
print()

# Sabitler Sütun Matrisi (B)
B = [[-1],
     [8],
     [2]]

# Bilinmeyenler Sütun Matrisi'nin yazdırılması
print("B:")
for i in range(len(B)):
    for j in range(len(B[0])):
        print(f"{B[i][j]:>2}", end=" ")
    print()
print()

# OUTPUT:
A:
 1 -2  1 
 2  1 -3 
 3 -2  2 

X:
x1 
x2 
x3 

B:
-1 
 8 
 2 

det(A) = |A| = 15

A1:
-1 -2  1 
 8  1 -3 
 2 -2  2 

det(A1) = |A1| = 30

x1 = |A1| / |A| = 30 / 15 = 2.0
x1 = 2

A2:
 1 -1  1 
 2  8 -3 
 3  2  2 

det(A2) = |A2| = 15

x2 = |A2| / |A| = 15 / 15 = 1.0
x2 = 1

A3:
 1 -2 -1 
 2  1  8 
 3 -2  2 

det(A3) = |A3| = -15

x3 = |A3| / |A| = -15 / 15 = -1.0
x3 = -1
