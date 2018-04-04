//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

var matris:[[Int]]=[[],[],[],[]]

for index in stride(from: 1, to: 101, by: 1) {
    if(index % 15) == 0 {
        matris[0].append(index)
    }
}

for index in stride(from: 1, to: 31, by: 1) {
    if(index % 5) == 0 {
        matris[1].append(index)
    }
}

for index in stride(from: 100, to: 49, by: -1) {
    if(index % 10) == 0 {
        matris[2].append(index)
    }
}

for index in stride(from: 2, to: 65, by: 1) {
    var us = 0,i=index
    //2'nin üslerinin belirlenmesi
    while (i>1){
        us = us + 1
        i = i / 2
    }
    
    //üslü kök alınarak 2 nin üssü olan sayıların diziye eklenmesi
    //modf(2.2).1 bize 0.2 yi vermektedir
    if (modf(pow(Double(index),1.0/Double(us))).1) == 0.0 {
        if (index != 3){ matris[3].append(index) }
    }
}

//kolonlu olarak yazdırma
for i in stride(from: 0, to: 6, by: 1) {
    for j in stride(from: 0, to: 4, by: 1) {
        print(matris[j][i],terminator:"\t")
    }
    print("") //print fonksiyonu default olarak \n içerir
}











