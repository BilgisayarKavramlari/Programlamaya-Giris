def faktoriyel(n)
    if n == 0
        1
    else
        faktoriyel = n * faktoriyel(n - 1)
    end
end

print "Bir sayi giriniz : "
n = gets.chomp.to_i

if n > 0
       puts "#{n}! degerinin sonucu : #{faktoriyel(n)} "
    else
       puts "Bir pozitif sayi giriniz!!"
 end


