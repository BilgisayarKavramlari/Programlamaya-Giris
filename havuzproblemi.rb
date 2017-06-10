
a=0

print "Kaç adet musluk olduğunu giriniz:"
musluksayisi=Integer(gets)

for i in 1..musluksayisi
  x=0

  print "#{i}. Musluğun doldurma süresi(saat):"
  x=Integer(gets)

  a= a + (x**-1)
end

  a=(a**-1)

print "Sonuç:"
puts Rational(a).to_s
