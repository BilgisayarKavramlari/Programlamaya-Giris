using System;

namespace kombinasyon
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayiBir, sayiIki, sonuc;
            do
            {
                Console.Write("Lutfen birinci sayiyi giriniz: ");
                sayiBir = Convert.ToInt32(Console.ReadLine());
                Console.Write("Lutfen ikinci sayiyi giriniz: ");
                sayiIki = Convert.ToInt32(Console.ReadLine());
            }
            while (sayiIki > sayiBir);
            sonuc = fakt(sayiBir) / (fakt(sayiIki) * fakt(sayiBir - sayiIki)); //Hesaplama
            Console.WriteLine("C({0}, {1}) = {2}", sayiBir, sayiIki, sonuc);
            Console.ReadKey();
        }
        static int fakt(int gelen) //Ozyineli faktoriyel fonksiyonu
        {
            if (gelen == 0 || gelen == 1)
            {
                return 1;
            }
            else
            {
                return gelen * fakt(gelen - 1);
            }
        }
    }
}
