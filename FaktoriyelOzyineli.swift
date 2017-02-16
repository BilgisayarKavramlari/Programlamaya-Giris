//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

func faktoriyel(_ n: Int) -> Int {
    if n == 1 {
        return 1
    } else {
        return n * faktoriyel(n - 1)
    }
}

print("bir sayi giriniz:")
if let sayi = Int(readLine(strippingNewline: true)!) {
    print(faktoriyel(sayi))
}


