    class Program
    {
        static void Main(string[] args)
        {
            //Kullanıcıdan şu an ki tarih bilgisi alınıyor.
            Console.WriteLine("Bugünün tarihini yıl olarak giriniz:");
            int SimdikiTarih = Convert.ToInt32(Console.ReadLine());

            // 2.yol olarak tarih bilgisini kullanıcıdan almak yerine DateTime sınıfı ile otomatik olarak da alabiliriz.
            int BugununTarihi = DateTime.Today.Year;

            //Kullanıcıdan doğum yılı bilgisi alınıyor.
            Console.WriteLine("Doğum yılınızı giriniz:");
            int DogumGunu = Convert.ToInt32(Console.ReadLine());

            // Yaş günü hesaplanıyor.
            int YasGunu = BugununTarihi - DogumGunu;

            // Sonuç ekrana yazdırılıyor.
            Console.WriteLine("Yaşınız: " + YasGunu);
            Console.ReadKey();
        }
      }
