def factorial(num):
    if num == 1:
        return 1
    else:
        result = num * factorial(num - 1)
        return result


n = int(input("Bir sayı giriniz: "))
print("Faktöriyeli = " + str(factorial(n)))
