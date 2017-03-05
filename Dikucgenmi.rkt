(display "Kenar uzunluklarını sırasıyla giriniz:\n")

( define x (read) )
( define y (read) )
( define z (read) )

( define (hipotenus x y)
   (  sqrt ( + (* x x) (* y y) )  ) 
)

( define (dikucgenmi x y z)
   (if (or  ( equal? x (hipotenus y z) )
            ( equal? y (hipotenus x z) )
            ( equal? z (hipotenus x y) )
       )
       (display "dikucgen")
       (display "dikucgen degil")
    )
)
    
(dikucgenmi x y z)
