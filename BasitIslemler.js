<!-- HTML + JavaScript kullanılmıştır -->
<html>

<script src="basitişlemler.js"></script>

<p>İlk sayıyı giriniz:</p>
<input id="birincisayı" type="number">
<p>İkinci sayıyı giriniz:</p>
<input id="ikincisayı" type="number">

<button onclick="basitİşlemler()">Hesapla!</button>

</html>

//basitişlemler.js dosyası:

function basitİşlemler() {
        var birincisayı, ikincisayı, toplam, fark, çarpım, bölüm;
        birincisayı = document.getElementById('birincisayı').value;
        ikincisayı = document.getElementById('ikincisayı').value;
        toplam = +birincisayı + +ikincisayı;
        // Toplam simgesi JavaScript'te hem toplama işlemi yapmak hem de iki stringi birbirine bağlamak için kullanılabilir.
        // Burada toplama işlemi yapmak istediğimizden değişkenlerin başına birer + daha koyduk.
        fark = birincisayı - ikincisayı;
        çarpım = birincisayı * ikincisayı;
        bölüm = birincisayı / ikincisayı;
            document.write("Toplam: " + toplam + "<br>");
            document.write("Fark: " + fark + "<br>");
            document.write("Çarpım: " + çarpım + "<br>");
            document.write("Bölüm: " + bölüm + "<br>")
        }
