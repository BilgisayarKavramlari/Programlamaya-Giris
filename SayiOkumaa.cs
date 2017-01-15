class SayiOkuma
    {
        /// <summary>
        /// Alınan Sayı Bilgisini Konsola Yazdıran C# Kod Örneği
        /// </summary>
        
        static void Main(string[] args)
        {
            //integer türünde bir değişken oluşturuyoruz.
            int sayi;
            
            Console.Write("Bir Sayi Giriniz : ");

            //Okuduğumuz sayi bilgisini sayi değişkenine atıyoruz.
            //ReadLine methodu bize sitring bir değer döndürdüğü için Convert.toInt32
            //methoduyla gelen değişkeni integer tipine dönüştürmek zorundayız.
             sayi = Convert.ToInt32(Console.ReadLine());

            //sayi değişkenini konsola basıyoruz.
            Console.WriteLine("Sayi : {0}",sayi);

            //Konsolun hemen kapanmasını engellemek için kullanıcıdan bir tuşa basmasını istiyoruz.
            Console.WriteLine("Çıkış Yapmak İçin Bir Tuşa Basınız");
            Console.ReadKey();
        }
    }
