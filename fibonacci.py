n = int(input('Fibonaccinin İlk N terimi için n='))
A = 0
print(A, end=('   '))
B = 1
print(B, end=('   '))
for i in range(n-1):
    F = A + B
    print(F, end=('   '))
    A = B
    B = F
    
