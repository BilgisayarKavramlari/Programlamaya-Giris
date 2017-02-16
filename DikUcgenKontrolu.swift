//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

print("birinci kenari giriniz:")
if var kenarBir = Int(readLine(strippingNewline: true)!) {
    print("ikinci kenari giriniz:")
    if var kenarIki = Int(readLine(strippingNewline: true)!) {
        print("ucuncu kenari giriniz:")
        if var kenarUc = Int(readLine(strippingNewline: true)!) {
            let hipotenus = Int(sqrt(pow(Double(kenarBir), 2) + pow(Double(kenarIki),2)))
            print(kenarUc==hipotenus ? "bu bir dik ucgendir" : "bu bir dik ucgen degildir")
        }
    }
}


