using System;

namespace ArdısıkSayı
{
    class Program
    {

        static void Main(string[] args)
        {
            
            Console.WriteLine("Kaca kadar artıs istersiniz : ");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Ardışık sayıların kacar kacar artmasını istersiniz : ");
            int b = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < a;)
            {
                i = i + b;
                Console.WriteLine(i);
            }
            
        }
    }
}
