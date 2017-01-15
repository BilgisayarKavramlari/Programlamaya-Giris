class Program
    {
        /// <summary>
        /// a*x^2 + b*x + c (a çarpı x'in karesi,  artı b çarpı x,  artı c) 
        /// ifadesi ile genellenen polinomların C# ile çözümü
        /// </summary>
        /// 
        
        static void Main(string[] args)
        {
            //Örnek olarak 3*4^2 + 5*6 + 7 denklemi çözülecektir.
            // Üs almak için Math.Pow fonksiyonu kullanılır.
            //Ek bilgi olarak kök alma işlemi için de Math.sqrt kullanılır.

            double denklem = 3 * Math.Pow(4, 2) + 5 * 6 + 7;

            Console.WriteLine("Sonuc : {0}", denklem);
            
            //Konsolun hemen kapanmasını engellemek için kullanıcıdan bir tuşa basmasını istiyoruz.
            Console.WriteLine("Çıkış Yapmak İçin Bir Tuşa Basınız");
            Console.ReadKey();
        }
    }
