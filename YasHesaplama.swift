//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("sene cinsinden bugunun tarihini giriniz:")
if var seneCinsindenBugununTarihi = Int(readLine(strippingNewline: true)!) {
    print("sene cinsinden dogum gununuzu giriniz:")
    if var seneCinsindenDogumGunu = Int(readLine(strippingNewline: true)!) {
        print("Yasiniz: \(seneCinsindenBugununTarihi-seneCinsindenDogumGunu)")
    }
}


