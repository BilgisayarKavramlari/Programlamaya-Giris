//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("a sayisini giriniz:")
if var sayiA = Double(readLine(strippingNewline: true)!) {
    print("b sayisini giriniz:")
    if var sayiB = Double(readLine(strippingNewline: true)!) {
        print("c sayisini giriniz:")
        if var sayiC = Double(readLine(strippingNewline: true)!) {
            print("sonuç: \(pow(sayiA,2.0) + pow(sayiB,2.0) + (3*sayiC))")
        }
    }
}


