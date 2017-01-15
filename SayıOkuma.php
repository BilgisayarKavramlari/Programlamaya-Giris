//PHP ile direk sayı okuma işlemi yapılamayacağı için HTML + PHP birlikte kullanılmıştır.

<html>
<form method="post" action="sayioku.php">
<input name="yazialani" type="text" />
<input type="button" value="submit" />
</html>

//sayioku.php dosyası;

<?php
$gelendeger = $_POST['yazialani'];
echo $gelendeger;
?>
