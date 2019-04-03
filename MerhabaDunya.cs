class Program
    {
        /// <summary>
        /// Konsola Merhaba Dünya yazan C# kod örneği
        /// </summary>
        
        static void Main(string[] args)
        {
            Console.WriteLine("Merhaba Dünya");

            //Merhaba Dünya yazıp konsolun kapanmasını engellemek
            //için kullanıcıdan bir tuşa basmasını istiyoruz
            Console.WriteLine("Çıkış Yapmak için bir tuşa basınız.");
            Console.ReadKey();
        }
    }
