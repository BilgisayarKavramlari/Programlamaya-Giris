class Program
    {
        /// <summary>
        /// Basit matematiksel işlemleri yapan C# Kodu
        /// </summary>
        static void Main(string[] args)
        {
            //Değişkenlerimizi oluşturup basit işlemlerimizi 10 ve 5 sayılarını kullanarak yapıyoruz.
            int toplama = 10 + 5;
            int cikarma = 10 - 5;
            int carpim = 10 * 5;
            int bolum = 10 / 5;
            int mod = 10 % 5;

            //Değişkenlerimizi ekrana basıyoruz. "\n" ifadesi bir alt satıra geçmek için kullanılır.
            Console.WriteLine(" Toplama : {0} \n Cikarma : {1} \n Carpma : {2} \n Bolme : {3} \n Mod : {4}",
                                toplama, cikarma, carpim, bolum, mod);

            //Konsolun hemen kapanmasını engellemek için kullanıcıdan bir tuşa basmasını istiyoruz.
            Console.WriteLine("Çıkış Yapmak İçin Bir Tuşa Basınız");
            Console.ReadKey();
        }
    }
