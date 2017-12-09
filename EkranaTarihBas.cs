class Program
    {
        /// <summary>
        /// Konsola Tarih Bilgisini Basan C# Kod Örneği
        /// </summary>
        
        static void Main(string[] args)
        {
            //Tarih bilgisini tutması için DateTime adında bir değişken oluşturuyoruz.
            DateTime simdi;

            //Şu anki zaman bilgisini simdi adlı değişkene atıyoruz.
            simdi = DateTime.Now;

            // Tarihi konsola yazdırıyoruz.
            Console.WriteLine("Sayi : {0}", simdi);

            //Konsolun hemen kapanmasını engellemek için kullanıcıdan bir tuşa basmasını istiyoruz.
            Console.WriteLine("Çıkış Yapmak İçin Bir Tuşa Basınız");
            Console.ReadKey();
        }
    }
