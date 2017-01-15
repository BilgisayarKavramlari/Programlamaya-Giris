//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

var tarihStringA="",tarihStringB=""

print("bugunun tarihini giriniz:")
//ilk tarihin kullanıcıdan alınması
if var gunA = readLine(strippingNewline: true) {
    if var ayA = readLine(strippingNewline: true) {
        if var yılA = readLine(strippingNewline: true) {
            tarihStringA = gunA + " " + ayA + " " + yılA
        }
    }
}

print("ikinci tarihi giriniz:")
//ikinci tarihin kullanıcıdan alınması
if var gunB = readLine(strippingNewline: true) {
    if var ayB = readLine(strippingNewline: true) {
        if var yılB = readLine(strippingNewline: true) {
            tarihStringB = gunB + " " + ayB + " " + yılB
        }
    }
}

//DateFormatter yardımıyla Date türünden tarihlerin oluşturulması
let dateFormatter = DateFormatter()
dateFormatter.dateFormat = "dd MM yyyy"
let tarihObjA = dateFormatter.date(from: tarihStringA)
let tarihObjB = dateFormatter.date(from: tarihStringB)

//takvim oluşturulması
let calendar = NSCalendar.current

let tarihA = calendar.startOfDay(for: tarihObjA!)
let tarihB = calendar.startOfDay(for: tarihObjB!)

let flags:Set<Calendar.Component> = [.day]
let components = calendar.dateComponents(flags, from: tarihB, to: tarihA)

print("iki tarih arasinda \(components.day!) gun vardir")

