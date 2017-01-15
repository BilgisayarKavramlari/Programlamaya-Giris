//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("Bir isci bu isi kac gunde yapar?")
if var birIsciKacGundeYapar = Int(readLine(strippingNewline: true)!) {
    print("İsci sayisini giriniz")
    if var kacIscıCalisicak = Int(readLine(strippingNewline: true)!) {
        print("isin bitme süresi \(birIsciKacGundeYapar / kacIscıCalisicak) gundur.")
    }
}
