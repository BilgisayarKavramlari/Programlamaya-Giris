def asal(sayi):
    i=2
    while i<sayi:
        if(sayi%i==0):
            return False
            continue
        else:
            i=i+1



def mergenne(sayi):
    msayi=(2**sayi)-1
    return msayi


for b in range(20):
    s=mergenne(b)
    if(asal(s)!=False):
        print(s)
