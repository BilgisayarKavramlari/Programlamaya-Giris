puts "Lutfen birinci sayiyi giriniz"
ilk_sayi = gets.chomp.to_i
puts "Lutfen ikinci sayiyi giriniz"
ikinci_sayi = gets.chomp.to_i
toplam = ilk_sayi+ikinci_sayi
puts "Girdiğiniz iki sayının toplamı: #{toplam}"
fark = ilk_sayi-ikinci_sayi
puts "Girdiğiniz iki sayının farkı: #{fark}"
carpim = ilk_sayi*ikinci_sayi
puts "Girdiğiniz iki sayının çarpımı #{carpim}"
bolme = ilk_sayi/ikinci_sayi
puts "Girdiğiniz iki sayının birbirine bölümü: #{bolme}"
kalan = ilk_sayi%ikinci_sayi
puts "Girdiğiniz ilk sayıyı ikinci sayıya böldüğümüzde kalan: #{kalan}"
