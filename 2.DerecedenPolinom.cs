class Program
    {
        /// <summary>
        /// a*x^2 + b*x + c (a çarpı x'in karesi,  artı b çarpı x,  artı c) 
        /// ifadesi ile genellenen polinomların C# ile çözümü
        /// </summary>
        /// 
        static void Main(string[] args)
        {

            int x, a, b, c;
            double sonuc;
            string denklem;

            Console.WriteLine("Denklemi 'a*x^2 + b*x + c' şeklinde düşünerek gerekli değişkenleri giriniz.");

            //Sırayla değişkenlerimizi kullanıcıdan alıyoruz.
            Console.Write("x değeri : ");
            x = Convert.ToInt32(Console.ReadLine());

            Console.Write("a değeri : ");
            a = Convert.ToInt32(Console.ReadLine());

            Console.Write("b değeri : ");
            b = Convert.ToInt32(Console.ReadLine());

            Console.Write("c değeri : ");
            c = Convert.ToInt32(Console.ReadLine());

            //Denklemi oluşturuyoruz. Aşağıdaki iki yol ile de oluşturulabilir.
            denklem = String.Format("{0}*{1}^2 + {2}*{3} + {4}", a, x, b, x, c);

            denklem = a + "*" + x + "^2" + " + " + b + "*" + x + " + " + c;

            Console.WriteLine("Denklemin Son Hali : {0}",denklem);

            // Üs almak için Math.Pow fonksiyonu kullanılır.
            //Ek bilgi olarak kök alma işlemi için de Math.sqrt kullanılır.
            sonuc = a * Math.Pow(x, 2) + b * x + c;
            Console.WriteLine(sonuc);

            //Konsolun hemen kapanmasını engellemek için kullanıcıdan bir tuşa basmasını istiyoruz.
            Console.WriteLine("Çıkış Yapmak İçin Bir Tuşa Basınız");
            Console.ReadKey();
        }
    }
