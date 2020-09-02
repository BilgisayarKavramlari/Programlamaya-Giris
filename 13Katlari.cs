using System;

namespace 13Katlari
{
    class Program
    {

        static void Main(string[] args)
        {
            //For Döngüsü ile 100'den 0 a kadar i'ye değer atandı.
            for (int i = 100; i >= 0; i--)
            {
                //%13 yazarak i 'nın modunu alındı. Yani  eğer sayı 13'e tam bölüne biliyorsa(13'ün katlarıysa) ekrana döndüdeki şartlar bitene kadar i 'nin değerini döndürür.
                if (i % 13 == 0)
                    Console.WriteLine(i);
            }

        }
    }
}
