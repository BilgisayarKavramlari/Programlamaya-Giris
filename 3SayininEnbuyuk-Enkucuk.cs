using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            double x, y, z, enb, enk;

            Console.Write("1.sayi :");                  // 1. sayi girildi
            x = int.Parse(Console.ReadLine());

            Console.Write("2.sayi :");                  // 2. sayi girildi
            y = int.Parse(Console.ReadLine());

            Console.Write("3.sayi :");                   // 3. sayi girildi
            z = int.Parse(Console.ReadLine());

            if (x >= y && x >= z) enb = x;              // x , y ve z den buyuk ve esit ise en buyuk x
            else if (y >= x && y >= z) enb = y;         // y , z ve x den buyuk ve esit ise en buyuk y
            else enb = z;                               // diger tum durumlarda en buyuk z

            if (x <= y && x <= z) enk = x;                 // x , y ve z den kucuk ise en kucuk x
            else if (y <= x && y <= z) enk = y;            // y , z ve x den kucuk ise en kucuk y
            else enk = z;                                // diger tum durumlarda en kucuk z

            Console.WriteLine("En buyuk : "+ enb);
            Console.WriteLine("En kucuk : "+ enk);

            Console.ReadKey();
        }
    }
}
