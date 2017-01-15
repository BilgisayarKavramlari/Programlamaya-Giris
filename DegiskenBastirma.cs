class DegiskenBastirma
    {
        /// <summary>
        /// Alınan İsim Bilgisini Konsola Yazdıran C# Kod Örneği
        /// </summary>
        
        static void Main(string[] args)
        {
            //String türünde bir değişken oluşturuyoruz.
            string isim;

            Console.WriteLine("İsminizi Yazınız");

            //Okuduğumuz isim bilgisini a değişkenine atıyoruz.
            isim = Console.ReadLine();

            //A değişkenini konsola basıyoruz.
            Console.WriteLine("İsminiz : {0}",isim);

            //Konsolun hemen kapanmasını engellemek için kullanıcıdan bir tuşa basmasını istiyoruz.
            Console.WriteLine("Çıkış Yapmak İçin Bir Tuşa Basınız");
            Console.ReadKey();
        }
    }
