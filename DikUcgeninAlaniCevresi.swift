//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("birinci kenar:")
if var kenarBir = Int(readLine(strippingNewline: true)!) {
    print("ikinci kenar:")
    if var kenarIki = Int(readLine(strippingNewline: true)!) {
        print("ucgenin alani: \((kenarBir * kenarIki) / 2)")
        let hipotenus = Int(sqrt(pow(Double(kenarBir), 2) + pow(Double(kenarIki),2)))
        print("ucgenin cevresi: \(hipotenus + kenarBir + kenarIki)")
    }
}


