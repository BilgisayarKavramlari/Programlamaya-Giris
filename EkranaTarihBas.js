<!-- HTML + JavaScript kullanılmıştır -->

<html>

<p>Lütfen günü giriniz:</p>
<input id="gün" type="number">

<p>Lütfen ayı giriniz:</p>
<input id="ay" type="number">

<p>Lütfen yılı giriniz:</p>
<input id="yıl" type="number">
<br><br>
<button onclick="TarihiYaz()">Tarihi ver!</button>
<script src="tarihokuryazar.js"></script>

</html>

//tarihokuryazar.js dosyası:

    function TarihiYaz() {
        var gün, ay, yıl;
        gün = document.getElementById('gün').value
        ay = document.getElementById('ay').value
        yıl = document.getElementById('yıl').value
        document.write("Gün, ay, yıl: " + gün + "." + ay + "." + yıl + "<br>");
        document.write("Ay, gün, yıl: " + ay + "." + gün + "." + yıl + "<br>");
        document.write("Yıl, ay, gün: " + yıl + "." + ay + "." + gün + "<br>");
    }
