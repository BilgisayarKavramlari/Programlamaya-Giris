matris = [[1, 2, 3],
          [4, 5, 6],
          [7, 8, 9],
          [10, 11, 12]]

print("Matris:")
for i in range(len(matris)):
    for j in range(len(matris[i])):
        print(matris[i][j], end="\t")
    print()

matris_T = [[0 for x in range(len(matris))] for y in range(len(matris[0]))]

for i in range(len(matris)):
    for j in range(len(matris[i])):
        matris_T[j][i] = matris[i][j]

print("\nTranspozu:")
for i in range(len(matris_T)):
    for j in range(len(matris_T[i])):
        print(matris_T[i][j], end="\t")
    print()

# OUTPUT:

# Matris:
# 1	2	3	
# 4	5	6	
# 7	8	9	
# 10 11 12	

# Transpozu:
# 1	4	7	10	
# 2	5	8	11	
# 3	6	9	12	
