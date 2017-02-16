<!-- HTML + JavaScript kullanılmıştır. -->

<html>

<p>Bir sayı giriniz.</p>

<script src="sayioku.js"></script>
<input id="yazialani" type="number">
<button onclick="SayiOkuma()">Sayıyı oku!</button>

</html>

//sayioku.js dosyası:

    function SayiOkuma() {
        document.write("Girdiğiniz sayı: " + document.getElementById('yazialani').value);
    }
