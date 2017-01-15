//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation


print("mesafeyi giriniz:")
if var mesafe = Int(readLine(strippingNewline: true)!) {
    print("hizi giriniz:")
    if var hiz = Int(readLine(strippingNewline: true)!) {
        var saat = Double(mesafe) / Double(hiz)
        //saat değişkeninde çıkan sonuç örneğin 1.2 olsun biz burada 0.2 değerini buluyoruz ve 60 ile çarparak dakikayı elde ediyoruz
        var dakika = (modf(saat).1) * 60
        print("\(Int(saat)) saat \(Int(dakika)) dakika")
    }
}


