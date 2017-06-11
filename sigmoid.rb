def sigmoid(x)
  x = -x
  sonuc=( 1 / ( 1 + ( Math.exp( x ) ) ) ).round(10)
  return sonuc
end


print("Sigmoid Fonksiyona girilecek sayıyı giriniz:")
x=Integer(gets)

print(sigmoid(x))
