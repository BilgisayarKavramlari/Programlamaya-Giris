"""
YASADIGIN GUN HESAPLAMA
"""
import datetime



tarih  = str(datetime.date.today())
tarih_suan = tarih.split("-")

tarih_suan1 = list(map(int, tarih_suan))

girdi = input("Dogum Tarihinizi YIL - AY - GUN seklinde girin :")
tarih_dogum = girdi.split("-")

tarih_dogum1 = list(map(int, tarih_dogum))



if (tarih_suan1[2] < tarih_dogum1[2] ):
    
    
    if(tarih_suan1[1] > tarih_dogum1[1] ):
        
        tarih_suan1[2] = tarih_suan1[2] + 30
        tarih_suan1[1] = tarih_suan1[1] -1
    
    elif(tarih_suan1[1] <= tarih_dogum1[1]):
        
        
        tarih_suan1[0] = tarih_suan1[0] - 1
        tarih_suan1[1] = tarih_suan1[1] + 12
        
        if (tarih_suan1[2] < tarih_dogum1[2] ):
    
    
                if(tarih_suan1[1] > tarih_dogum1[1] ):
        
                        tarih_suan1[2] = tarih_suan1[2] + 30
                        tarih_suan1[1] = tarih_suan1[1] -1

elif (tarih_suan1[2] >= tarih_dogum1[2] ):
    
    if (tarih_suan1[1] <= tarih_dogum1[1]):
        
        tarih_suan1[0] = tarih_suan1[0] - 1
        tarih_suan1[1] = tarih_suan1[1] + 12
        
        if (tarih_suan1[2] < tarih_dogum1[2] ):
    
    
                if(tarih_suan1[1] > tarih_dogum1[1] ):
        
                        tarih_suan1[2] = tarih_suan1[2] + 30
                        tarih_suan1[1] = tarih_suan1[1] -1
                        


yıl = tarih_suan1[0] - tarih_dogum1[0]

ay = tarih_suan1[1] - tarih_dogum1[1]

gun = tarih_suan1[2] - tarih_dogum1[2]

print("\n\n{} gundur yasıyorsunuz. ".format((yıl*365) + (ay * 30 ) + gun))

enter = input()
