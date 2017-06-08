def kontrol(a, b, c)


  if((a*a)+(b*b)==(c*c))
    puts "Bu üçgen dik üçgendir."
  else
    puts "Bu üçgen dik değildir."
  end
end

print "Birinci kenarı giriniz:"
a=Integer(gets)
print  "İkinci kenarı giriniz:"
b=Integer(gets)
print  "Üçüncü kenarı giriniz:"
c=Integer(gets)

kontrol(a,b,c)
