using System;

namespace HarfNotu
{
    class Program
    {
        int a;
        static void Main(string[] args)
        {
            
            Console.WriteLine("Notunuzu giriniz ");
            int a = Convert.ToInt32(Console.ReadLine());

            if (a > 100 || a < 0)
            {
                Console.WriteLine("Hatali girish");
            }
            else if (a >= 90)
            {
                Console.WriteLine("Harf notunuz: A");
            }
            else if (a >= 80)
            {
                Console.WriteLine("Harf notunuz: B");
            }
            else if (a >= 70)
            {
                Console.WriteLine("Harf notunuz: C");
            }
            else if (a >=60)
            {
                Console.WriteLine("Harf notunuz: D");
            }
            else if (a >= 0)
            {
                Console.WriteLine("Harf notunuz: F");
            }
        }
    }
}
