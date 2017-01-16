//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

func faktoriyel(_ n: Int) -> Int {
    var sonuc = 1
    for i in 1...n{
        sonuc = sonuc * i
    }
    return sonuc
}

print("bir sayi giriniz:")
if let sayi = Int(readLine(strippingNewline: true)!) {
    print(faktoriyel(sayi))
}


