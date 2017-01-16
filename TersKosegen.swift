//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

print("bir sayi giriniz:")
if var sayi = Int(readLine(strippingNewline: true)!) {
    for i in 1...sayi {
        for j in 1...sayi {
            print( i+j == sayi+1 ? "1" : "0" , terminator:"\t")
        }
        print("",terminator:"\n\n")
    }
}


