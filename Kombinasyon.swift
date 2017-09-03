//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

func faktoriyel(_ a: Int) -> Int {
    var sonuc = 1
    for i in 1...a{
        sonuc = sonuc * i
    }
    return sonuc
}


func kombinasyon(_ n: Int,_ r: Int) -> Int {
    return faktoriyel(n) / (faktoriyel(r)*faktoriyel(n-r))
}

print("birinci sayiyi giriniz:")
if let sayiA = Int(readLine(strippingNewline: true)!) {
    print("ikinci sayiyi giriniz:")
    if let sayiB = Int(readLine(strippingNewline: true)!) {
        print("kombinasyon: \(kombinasyon(sayiA,sayiB))")
    }
}


