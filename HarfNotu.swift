//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

print("notunuzu giriniz:")
if var not = Int(readLine(strippingNewline: true)!) {
    switch not {
    case 90...100: print("harf notunuz a")
    case 80..<90: print("harf notunuz b")
    case 70..<80: print("harf notunuz c")
    case 0..<70: print("harf notunuz f")
    default:print("hatalı giriş")
    }
}


