//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

var x = -1 ,y = 1, toplam = 0;
print("bir sayi giriniz:")
if let sayi = Int(readLine(strippingNewline: true)!) {
    for i in 0..<sayi {
        toplam = x+y;
        x   = y;
        y   = toplam;
        print(toplam);
    }
}











