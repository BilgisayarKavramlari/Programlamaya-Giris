using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static int Rek_Faktoriyel(int x)
        {
            if (x == 1) return 1;
            else if (x == 0) return 0;
            else
            {
                return x * Rek_Faktoriyel(x - 1);
            }

        }

        static void Main(string[] args)
        {


            Console.Write("Faktoriyelini hesaplamak istediginiz sayi :");

            int k = int.Parse(Console.ReadLine());

            Console.WriteLine("");
            
            Console.Write("Sonuc :");

            Console.ForegroundColor = ConsoleColor.Green;

            Console.WriteLine(Rek_Faktoriyel(k) + "\n");

            Console.ResetColor();

            Console.ReadKey();
        }   
    }
}
