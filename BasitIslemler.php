<?php

function dortislem($sayi1, $sayi2, $islem)
{

	$sonuc = null;

	if($islem=='toplama' || $islem=='cikarma' || $islem=='bolme' || $islem=='carpma')
	{
		if((is_int($sayi1) || is_double($sayi1)) && (is_int($sayi2) || is_double($sayi2)))
		{
			switch ($islem) {
			 	
			 	case 'toplama':
			 	$sonuc = 'Sonuc: '.($sayi1+$sayi2);
			 	break;
        
			 	case 'cikarma':
			 	$sonuc = 'Sonuc: '.($sayi1-$sayi2);
			 	break;

			 	case 'bolme':
			 	$sonuc = 'Sonuc: '.($sayi1/$sayi2);
			 	break;

			 	case 'carpma':
			 	$sonuc = 'Sonuc: '.($sayi1*$sayi2);
			 	break;
			 	
			 	default:
			 		// default code
			 	break;

			 } 
		}else{
			$sonuc = 'Lütfen sayı giriniz';
		}
	}else{
		$sonuc = 'Lütfen toplama, cikarma, bolme yada cikarma yazınız';
	}

	return $sonuc;
}


echo dortislem(5,7.9,'toplama');

?>
