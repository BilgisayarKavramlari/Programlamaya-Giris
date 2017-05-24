<html>
<form action="" method = "post" />
<input type="text" name="sayi1">
<input type="text" name="sayi2">
<input type="text" name="sayi3">
<button>Gönder</button>
</form>
</html>

<?php 

if($_POST){




	$sayi1 = @$_POST["sayi1"];
	$sayi2 = @$_POST["sayi2"];
	$sayi3 = @$_POST["sayi3"];

if(!empty($sayi1 && $sayi2 && $sayi3)){

 if ($sayi1 > $sayi2 && $sayi1 < $sayi3) {
            echo $sayi1." sayısı 2. sayı ve 3. sayının arasındadır.<br />";
        } else {
            echo $sayi1." sayısı 2. sayı ve 3. sayının arasında değildir.<br />";
        }
        //İlk Girilen Sayı 2. Sayı ile eşit ve 3. Sayıdan Küçük mü?
        if ($sayi1 == $sayi2 && $sayi1 < $sayi3) {
            echo $sayi1." sayısı 2. sayı ile eşit ve 3. sayıdan küçüktür.<br />";
        } else {
            echo $sayi1." sayısı 2. sayı ile eşit ve 3. sayıdan küçük değildir.<br />";
        }
        //İlk Girilen Sayı 2. Sayı veya 3. Sayıdan Büyük mü?
        if ($sayi1 > $sayi1 || $sayi1 > $sayi3) {
            $sayi1." sayısı 2. sayı veya 3. sayıdan büyüktür.<br />";
        } else {
            echo $sayi1." sayısı 2. sayı veya 3. sayıdan büyük değildir.<br />";
        }
        //Girilen Sayılar Birbirlerine Eşit mi?
        if ($sayi1 == $sayi2 && $sayi2 == $sayi3) {
            echo "Girilen sayılar birbirlerine eşit.<br />";
        } else {
            echo "Girilen sayılar birbirlerine eşit değildir.<br />";
        }

    


}else{


echo "tüm alanlar dolu olmalıdır.";


}

}

   ?>
