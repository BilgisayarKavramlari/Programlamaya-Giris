using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

            int a;
            Console.Write("Give me a Number :");
             a = int.Parse(Console.ReadLine());
            Console.WriteLine(a);
            Console.WriteLine("Your gave the number:" + a);
            Console.ReadKey();
        }
    }
}
