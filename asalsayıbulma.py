import numbers
n=int(input())
prime=[2]
notprime=[1]
for b  in prime:

    if n>1:
        for a in range(2,n):
            if a%b==0:
                notprime.append(a)
            else:
                prime.append(a)
                print(a)
    break
print('asal sayılar')
print(prime)
print('asal olmayan sayılar')
print(notprime)
