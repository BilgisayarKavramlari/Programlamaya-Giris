//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

var sayilar:[Int] = []
print("birinci sayiyi giriniz:")
if var sayiA = Int(readLine(strippingNewline: true)!) {
    print("ikinci sayiyi giriniz:")
    if var sayiB = Int(readLine(strippingNewline: true)!) {
        print("ucuncu sayiyi giriniz:")
        if var sayiC = Int(readLine(strippingNewline: true)!) {
            //sayilari diziye ekleyip min() ve max() fonksiyonlarıyla degerler bulunur
            sayilar.append(sayiA)
            sayilar.append(sayiB)
            sayilar.append(sayiC)
            print(sayilar.max()!)
            print(sayilar.min()!)
        }

    }
}


