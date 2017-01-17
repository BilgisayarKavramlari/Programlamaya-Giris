# Created by Hüseyin Karakullukçu on 15.01.2017


def fibonacci(n):
    # a ve b adında iki değişken tanımlıyoruz.
    a, b = 1, 1
    # İlk elemanı basıyoruz
    print(a)
    for i in range(n-1):
        # Takas işlemi uyguluyoruz. a'nın yeni değeri b oluyor. b'nin yeni değeri a+b oluyor.
        a, b = b, a+b
        print(a)
    return


def main():
    # Kullanıcıdan bir sayı istiyoruz.
    girdi = input("Lütfen bir sayı giriniz: ")
    try:
        fibonacci(int(girdi))
    except ValueError:
        # Eğer kullanıcının girdiği değer bir sayı değil ise bu yazıyı basıyoruz.
        print("Hata!! Girilen değer bir sayı değil")


main()
