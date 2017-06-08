def faktöriyel(n)
  if n < 0
    return "Lütfen pozitif bir sayı giriniz"
  end

  if n <= 1
    1
  else
    n * faktöriyel(n-1)
  end
end

print "İlk sayıyı giriniz:"
n=Integer(gets)
print "İkinci sayıyı giriniz:"
r=Integer(gets)
print "\n"
print "Sonuç:"
puts faktöriyel(n)/(faktöriyel(r)*(faktöriyel(n-r)))
