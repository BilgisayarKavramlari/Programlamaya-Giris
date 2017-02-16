 class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Üçgenin birinci dik kenar uzunluğunu girin:");
            int Kenar1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Üçgenin ikinci dik kenar uzunluğunu girin:");
            int Kenar2 = Convert.ToInt32(Console.ReadLine());

            int Hipotenus = (int)Math.Sqrt(Math.Pow(Kenar1, 2) + Math.Pow(Kenar2, 2));

            Console.WriteLine("Dik üçgenin Alanı= {0}", AlanHesapla(Kenar1, Kenar2));
            Console.WriteLine("Dik üçgenin çevresi = {0}", CevreHesapla(Kenar1, Kenar2, Hipotenus));
            Console.ReadKey();
        }

        static int AlanHesapla(int k1, int k2)
        {
            int Alan = (k1 * k2) / 2;
            return Alan;
        }
        static int CevreHesapla(int k1, int k2, int k3)
        {
            int Cevre = k1 + k2 + k3;
            return Cevre;
        }
    }
