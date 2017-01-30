 class Program
    {
        static void Main(string[] args)
        {
            // Girilecek iki tarih bilgisinin gün,ay,yıl değerlerini tutacak 2 dizi tanımlanıyor.
            int[] ilkTarih = new int[3];
            int[] ikinciTarih = new int[3];

            /* Dizilerin 1. indisinde tutulacak olan ay bilgilerinin 0 olan varsayılan değerleri, döngü içide 
            istenen aralıkların dışında olduğu için varsayılan değerlerine 1 değeri atanıyor.*/
            ilkTarih[1] = 1;
            ikinciTarih[1] = 1;

            /* 3 farklı döngü yaratmak yerine i sayacı sayesinde dizideki kelimeler
            sırasıyla kullanılarak bir döngü içerisinde gün,ay,yıl bilgileri alınıyor. */  
            string[] sozcukler = { "gününü","ayını","yılını"};
            
            int i = 0;
            
            while (i<=2)
            {
                Console.WriteLine("İlk tarihin " + sozcukler[i] + " giriniz:");
                ilkTarih[i] = int.Parse(Console.ReadLine());

                if (ilkTarih[0] < 1 || ilkTarih[0] > 31)
                    Console.WriteLine("Lütfen 1-31 arasında bir gün girin.");

                else if (ilkTarih[1] < 1 || ilkTarih[1] > 12)
                    Console.WriteLine("Lütfen 1-12 arasında bir ay girin.");
                else
                    i++;
            }

            // i sayacı sıfırlanıyor.
            i = 0;

            while (i <= 2)
            {
                Console.WriteLine("İkinci tarihin " + sozcukler[i] + " giriniz:");
                ikinciTarih[i] = int.Parse(Console.ReadLine());

                if (ikinciTarih[0] < 1 || ikinciTarih[0] > 31)
                    Console.WriteLine("Lütfen 1-31 arasında bir gün girin.");

                else if (ikinciTarih[1] < 1 || ikinciTarih[1] > 12)
                    Console.WriteLine("Lütfen 1-12 arasında bir ay girin.");
                else
                    i++;
            }
            
            // DateTime sınıfı kullanılarak alınan değerler parametre olarak giriliyor.
            DateTime dt = new DateTime(ilkTarih[2], ilkTarih[1], ilkTarih[0]);
            DateTime dt2 = new DateTime(ikinciTarih[2], ikinciTarih[1], ikinciTarih[0]);

            // TimeSpan sınıfının Subtract metoduyla iki tarih arasındaki fark hesaplanıyor.
            // TotalDays metoduyla iki tarih arasındaki fark gün olarak hesaplanıp int değişkenine atanıyor.
            TimeSpan tspan = dt.Subtract(dt2);
            int ToplamGun = Convert.ToInt32(tspan.TotalDays);

            // Tarih bilgileri belirli formatta string değişkenlerine atanıyor.
            string Tarih1 = String.Format("{0:d}",dt);
            string Tarih2 = String.Format("{0:d}", dt2);

            // ToplamGun değişkeni sonucun eksili bir olarak görünmemesi için Math sınıfının Abs metoduyla pozitif yapılıyor.
            //Sonuc ekrana yazdırılıyor. 
            Console.WriteLine("{0} tarihiyle {1} tarihi arasında " + Math.Abs(ToplamGun) + " gün vardır.", Tarih1, Tarih2);
            Console.ReadKey();
        }        
    }
