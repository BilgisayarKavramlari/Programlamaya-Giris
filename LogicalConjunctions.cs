using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LogicalConjunctions
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;

            Console.Write("Enter the a: ");
            a = int.Parse(Console.ReadLine());

            Console.Write("Enter the b: ");
            b = int.Parse(Console.ReadLine());

            Console.Write("Enter the c: ");
            c = int.Parse(Console.ReadLine());

            if((a < b && a > c) || (a > b && a < c))
                Console.WriteLine("a is between b and c");
            else
                Console.WriteLine("a is not between b and c");

            if(a == b)
            {
                if(a < c)
                    Console.WriteLine("a is equal to b and smaller than c");
                else
                    Console.WriteLine("a is equal to b and greater than c");
            }
            else
            {
                if(a < c)
                    Console.WriteLine("a is not equal to b and smaller than c");
                else
                    Console.WriteLine("a is not equal to b and greater than c");
            }

            if (a > b || a > c)
                Console.WriteLine("a is greater than b or c");
            else
                Console.WriteLine("a is not greater than b or c");

            if (a == b && b == c)
                Console.WriteLine("The numbers are equal");
            else
                Console.WriteLine("The three numbers are not equal");
        }
    }
}
