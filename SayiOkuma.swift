//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

print("bir sayi giriniz:")
//girilen değer ile integer türünden bir değişken oluşturulabilmiş ise bunu ekrana yazdırır.
if let sayi = Int(readLine(strippingNewline: true)!) {
    print("girdiginiz sayi: \(sayi)")
}
