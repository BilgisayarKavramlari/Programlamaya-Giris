//  Created by Kağan on 15.01.2017.
//  Copyright © 2017 Kağan Utku Kılıçlı. All rights reserved.

import Foundation

enum hareketler {
    case sag
    case asagi
    case sol
    case yukari
}

//Dizi uzerinde hareket etme fonksiyonlari 
//inout yazan parametreler pointer görevi görmektedir
func sagaYaz(matris:inout [[Int]],sonX:inout Int,sonY:inout Int,sonSayi:inout Int,tekrar:Int){
    
    for i in 0..<tekrar {
        sonSayi = sonSayi + 1
        sonY = (i != 0 || sonX != 0) ? sonY + 1: sonY //ilk satirda farkli diger satirlarda farkli calismasi icin if kullanildi
        matris[sonX][sonY] = sonSayi
        
    }
}

func solaYaz(matris:inout [[Int]],sonX:inout Int,sonY:inout Int,sonSayi:inout Int,tekrar:Int){
    for _ in 0..<tekrar {// eger degiskeni for icinde kullanmanıza gerek yok ise _ yazıp gecebilirsiniz
        sonSayi = sonSayi + 1
        sonY = sonY - 1
        matris[sonX][sonY] = sonSayi
    }
}

func asagiYaz(matris:inout [[Int]],sonX:inout Int,sonY:inout Int,sonSayi:inout Int,tekrar:Int){
    for _ in 0..<tekrar {
        sonSayi = sonSayi + 1
        sonX = sonX + 1
        matris[sonX][sonY] = sonSayi
    }
}

func yukariYaz(matris:inout [[Int]],sonX:inout Int,sonY:inout Int,sonSayi:inout Int,tekrar:Int){
    for _ in 0..<tekrar {
        sonSayi = sonSayi + 1
        sonX =  sonX - 1
        matris[sonX][sonY] = sonSayi
    }
}

print("bir sayi giriniz:")
if let sayi = Int(readLine(strippingNewline: true)!) {
    
    var matris:[[Int]] = Array(repeatElement(Array(repeatElement(0, count: sayi)), count: sayi)) //ici sifirla dolu istenilen matrisi olusturma
    var hareketDic = Dictionary<Int,[hareketler:Int]>()//Yapılacak hareketleri kaydetmek için dictionary
    let temelHareketler:[hareketler] = [.sag,.asagi,.sol,.yukari]//tüm olası hareketleri kullanilicak sirayla dizi olarak olusturma
    var tekrar = sayi, sonSayi=0, sonX=0, sonY=0 // kullanilicak degiskenler
    
    //yapılacak tüm hareketlerin ve kaç kere yapılacaklarının hareketDic dictionary'sine atıldığı kısım
    for i in 0...((sayi-1)*2) {
        hareketDic[i] = [temelHareketler[i % 4]:tekrar]
        if (i % 2 == 0) { tekrar = tekrar - 1 }
    }
    
    //tüm hareketlerin sıralanıp isleme konuldugu kisim
    for (i,j) in hareketDic.sorted(by: {$0.key < $1.key}) {
        var k = j
        let item = k.first
        switch item!.key {
        case .sag: sagaYaz(matris: &matris, sonX: &sonX, sonY: &sonY,sonSayi: &sonSayi, tekrar: item!.value)
        case .sol: solaYaz(matris: &matris, sonX: &sonX, sonY: &sonY,sonSayi: &sonSayi, tekrar: item!.value)
        case .asagi: asagiYaz(matris: &matris, sonX: &sonX, sonY: &sonY,sonSayi: &sonSayi, tekrar: item!.value)
        case .yukari: yukariYaz(matris: &matris, sonX: &sonX, sonY: &sonY,sonSayi: &sonSayi, tekrar: item!.value)
        }
    }
    
    //matrisi yazdırma
    for i in matris {
        for j in i {
            print(j,terminator:"\t")
        }
        print("")
    }
}


