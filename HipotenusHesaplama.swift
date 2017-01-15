//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("birinci kenar:")
if var kenarBir = Double(readLine(strippingNewline: true)!) {
    print("ikinci kenar:")
    if var kenarIki = Double(readLine(strippingNewline: true)!) {
        //pow ile kareleri alınıp toplandıktan sonra sqrt fonkiyonu ile karekökü alınır ve sonuç elde edilir.
        print("hipotenus: \(Int(sqrt(pow(kenarBir, 2) + pow(kenarIki,2))))")
    }
}


