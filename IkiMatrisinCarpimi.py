# Matris Çarpımı (Matrix Multiplication)
# İki Boyutlu İki Matrisin Çarpılması (Boyutları Çarpım Kurallarına Uygun)

# Kullanıcıdan iki matrisin kaça kaç matris olacağı girdirilmesi
satir1 = int(input("1. matrisin satir sayısını girin: "))
sutun1 = int(input("1. matrisin sütun sayısını girin: "))
satir2 = int(input("2. matrisin satir sayısını girin: "))
sutun2 = int(input("2. matrisin sütun sayısını girin: "))

# İki matrisin boyutlarının çarpım kurallarına uygunluk kontrolü
# Uygunsa;
if sutun1 == satir2:
    # Boş matrislerin oluşturulması
    m1 = [[0 for x in range(sutun1)] for y in range(satir1)]
    m2 = [[0 for x in range(sutun2)] for y in range(satir2)]
    mc = [[0 for x in range(sutun2)] for y in range(satir1)]
    
    # Kullanıcıdan 1. matrisin değerleri girdirilmesi
    print("\n1. matris değerlerini girin:")
    for i in range(satir1):
        for j in range(sutun1):
            m1[i][j] = int(input(f"m1[{i}][{j}] = "))
    
    # Kullanıcıdan 2. matrisin değerleri girdirilmesi
    print("\n2. matris değerlerini girin:")
    for i in range(satir2):
        for j in range(sutun2):
            m2[i][j] = int(input(f"m2[{i}][{j}] = "))
    
    # 1. matris yazdırılıyor
    print("\nm1:")
    for i in range(satir1):
        for j in range(sutun1):
            print(m1[i][j], end=" ")
        print()
    print()
    
    # çarpma işareti
    print("x\n")
    
    # 2. matris yazdırılıyor
    print("m2:")
    for i in range(satir2):
        for j in range(sutun2):
            print(m2[i][j], end=" ")
        print()
    print()
    
    # eşittir işareti
    print("=\n")
    
    # İki matris çarpılarak mc sonuç matrisi elde ediliyor
    for i in range(satir1):
        for j in range(sutun2):
            for k in range(satir2):
                mc[i][j] += m1[i][k] * m2[k][j]
    
    # mc sonuç matrisin elde edilişi
    print("mc = m1 x m2")
    
    # mc sonuç matrisi yazdırılıyor
    print("\nmc:")
    for i in range(satir1):
        for j in range(sutun2):
            print(mc[i][j], end=" ")
        print()

# İki matrisin boyutlarının çarpım kurallarına uygun değilse;
else:
    print("\nBu matrisler çarpılamaz!!!")
