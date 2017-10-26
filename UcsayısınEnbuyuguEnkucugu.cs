using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaximunuBulmaSayilarin
{
    class Program
    {
        static void Main()
        {
            Console.WriteLine("1.sayıyı girin");
            double sayi1 = double.Parse(Console.ReadLine());
            Console.WriteLine("2.sayıyı girin");
            double sayi2 = double.Parse(Console.ReadLine());
            Console.WriteLine("3.sayıyı girin");
            double sayi3 = double.Parse(Console.ReadLine());

            double sonuc = Maximum(sayi1, sayi2, sayi3);
            double sonuc2 = Minimum(sayi1, sayi2, sayi3);

            Console.WriteLine("Sayıların en büyüğü:" + sonuc);
            Console.WriteLine("Sayıların en küçüğü:" + sonuc2);

            Console.ReadKey();

          
        }
         static double Maximum(double x, double y, double z)
        {
            double maximumdeger = x;

            if (y > maximumdeger)
            {
                maximumdeger = y;
            }

            if (z > maximumdeger)
            {
                maximumdeger = z;
            }
            return maximumdeger;


        }
        static double Minimum(double x,double y,double z)
        {
            double minimumdeger = x;
            if(y<minimumdeger)
            {
                minimumdeger = y;
                
            }
            if(z<minimumdeger)
            {
                minimumdeger = z;
            }
            return minimumdeger;


        }
    }
}
