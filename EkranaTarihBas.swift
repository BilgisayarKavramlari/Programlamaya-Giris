//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

let tarih = Date()
let birimler: Set<Calendar.Component> = [.hour, .minute, .day, .month, .year]
let sonuc = Calendar.current.dateComponents(birimler, from: tarih)

print("\(sonuc.day!).\(sonuc.month!).\(sonuc.year!) \(sonuc.hour!):\(sonuc.minute!)")

