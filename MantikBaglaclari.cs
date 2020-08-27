using System;

namespace MantikBaglaclari
{
    class Program
    {
        int a, b, c;
        static void Main(string[] args)
        {
            //Konsoldan a,b,c değerlerini iste.
            Console.WriteLine("a'yi giriniz : ");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("b'yi giriniz : ");
            int b = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("c'yi giriniz : ");
            int c = Convert.ToInt32(Console.ReadLine());

            //a'nin b ve c arasinda olup olmadığını kontrol et
            if (a < b && a > c || a > b && a < c)
            {
                Console.WriteLine("a sayisi b ve c arasinda bir sayidir");
            }
            else
            {
                Console.WriteLine("a sayisi b ve c arasinda bir sayi degildir");
            }

            //a'nin c ye esit b den buyuk olup olmadığını kontrol et
            if (a == c && a > b)
            {
                Console.WriteLine("a sayisi c'ye esit b'den buyuk bir sayidir");
            }

            //a'nin c ye esit b den kucuk olup olmadığını kontrol et
            if (a == c && a < b)
            {
                Console.WriteLine("a sayisi c'ye esit b'den kucuk bir sayidir");
            }

            //a'nin b ye esit c den buyuk olup olmadığını kontrol et
            if (a == b && a > c)
            {
                Console.WriteLine("a sayisi b'ye esit c'den buyuk bir sayidir");
            }

            //a'nin b ye esit c den kucuk olup olmadığını kontrol et
            if (a == b && a < c)
            {
                Console.WriteLine("a sayisi b'ye esit c'den kucuk bir sayidir");
            }

            //a'nin b den ve c den buyuk olup olmadığını kontrol et
            if (a>b||a>c)
            {
                Console.WriteLine("a sayisi b'den ve c'den buyuk bir sayidir");
            }

            //a ve b ve c 'nin birbirlerine eşit olma durumunu kontrol et.
            if (a == b && a == c)
            {
                Console.WriteLine("Tüm sayılar birbirine eşittir");
            }
            else
            {
                Console.WriteLine("Sayılar eşit değildir");
            }
        }
    }
}
