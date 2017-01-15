//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("lütfen birinci sayiyi giriniz:")
if var sayiA = Double(readLine(strippingNewline: true)!) {
    print("lütfen ikinci sayiyi giriniz:")
    if var sayiB = Double(readLine(strippingNewline: true)!) {
        print("toplam: \t \(sayiA + sayiB)")
        print("fark: \t \(sayiA - sayiB)")
        print("carpim: \t \(sayiA * sayiB)")
        print("bolum: \t \(sayiA / sayiB)")
        print("kalan: \t \(Int(sayiA) % Int(sayiB))")
    }
}


