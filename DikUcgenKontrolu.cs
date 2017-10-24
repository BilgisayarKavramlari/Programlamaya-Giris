using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DikUcgenKontrolu
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;
            Console.WriteLine("1.Kenar uzunluğunu girin");
            a = int.Parse(Console.ReadLine());
            Console.WriteLine("2.Kenar uzunluğunu girin");
            b = int.Parse(Console.ReadLine());
            Console.WriteLine("3.Kenar uzunluğunu girin");
            c = int.Parse(Console.ReadLine());

            int birveikikenar = (int)(Math.Pow(a, 2) + Math.Pow(b, 2));
            int hipotenus = (int)(Math.Pow(c, 2));

            if (birveikikenar == hipotenus)
                Console.WriteLine("Dik üçgendir");
            else
                Console.WriteLine("Dik üçgen değildir");
            Console.ReadLine();

        }
    }
}
