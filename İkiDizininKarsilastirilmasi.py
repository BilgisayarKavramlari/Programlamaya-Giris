a = [1, 2, 2]
b = [0, 1, 2, 2, 3]

sonuc = False

for i in range((len(b) - len(a)) + 1):
    if a == b[i:i+len(a)]:
        sonuc = True

if sonuc:
    print("Evet. a, b'nin bir parçası.")
else:
    print("Hayır. a, b'nin bir parçası değil.")
