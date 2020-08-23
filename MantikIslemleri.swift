//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("birinci sayiyi giriniz:")
if var sayiA = Int(readLine(strippingNewline: true)!) {
    print("ikinci sayiyi giriniz:")
    if var sayiB = Int(readLine(strippingNewline: true)!) {
        print(sayiA == sayiB ? "sayilar esittir" : "sayilar esit degildir")
        print(sayiA != sayiB ? "sayilar farklidir" : "sayilar farkli degildir")
        print(sayiA < sayiB ? "ilk sayi kucuktur" : "ilk sayi kucuk degildir")
        print(sayiA > sayiB ? "ikinci sayi kucuktur" : "ikinci sayi kucuk degildir")
        print(sayiA <= sayiB ? "ilk sayi kucuk esittir" : "ilk sayi kucuk esit degildir")
        print(sayiA >= sayiB ? "ikinci sayi kucuk esittir" : "ikinci sayi esit degildir")
    }
}


