let number1 = prompt("Birinci sayiyi giriniz: ","5")
let number2 = prompt("İkinci sayiyi giriniz: ","10")

n1 = parseInt(number1)
n2 = parseInt(number2)

if(n1 == n2){
    console.log("Sayılar eşittir")
    console.log("Sayılar farklı değildir")
}
if(n1 != n2){
    console.log("Sayılar eşit değildir")
    console.log("Sayılar farklıdır")
}
if(n1<n2){
    console.log("İlk sayı küçüktür")
    console.log("İkinci sayı küçük değildir")
}
if(n1>n2){
    console.log("İkinci sayı büyüktür")
    console.log("İlk sayı küçük değildir")
}
if(n1<=n2){
    console.log("İlk sayı küçük eşittir")
}
if(n1>=n2){
    console.log("İkinci sayı küçük eşittir")
}
