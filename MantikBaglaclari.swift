//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("birinci sayiyi giriniz:")
if var sayiA = Int(readLine(strippingNewline: true)!) {
    print("ikinci sayiyi giriniz:")
    if var sayiB = Int(readLine(strippingNewline: true)!) {
        print("ucuncu sayiyi giriniz:")
        if var sayiC = Int(readLine(strippingNewline: true)!) {
            print((sayiA > sayiB) && (sayiA < sayiC) ? "A, B ile C arasindadir" : "A, B ile C arasinda değildir")
            print((sayiA > sayiB) || (sayiA > sayiC) ? "A, B'den veya C'den buyuktur" : "A, B'den veya C'den buyuk degildir")
            print((sayiA == sayiB) && (sayiA < sayiC) ? "A, B'ye eşit ve ayni zamanda C'den kucuktur" : "A, B'ye eşit ve ayni zamanda C'den kucuk degildir")
            print((sayiA == sayiB) && (sayiB == sayiC) ? "uc sayi birbirine esittir" : "uc sayi birbirine esit degildir")
        }

    }
}


