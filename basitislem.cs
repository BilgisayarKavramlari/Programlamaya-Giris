using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace degiskenbastir
{
    internal class simpleoperation
    {
        static void Main(string[] args)
        {
            String val1;
            String val2;
            int res1,res2;
            Console.WriteLine("Num1 ");
            val1 = Console.ReadLine();
            Console.WriteLine("Num2 ");
            val2 = Console.ReadLine();

            // convert to integer
            res1= Convert.ToInt32(val1);
            res2 = Convert.ToInt32(val2);

            // display the line
            Console.WriteLine("Add = {0}", res1+res2);
            Console.WriteLine("Sub = {0}", res1 - res2);
            Console.WriteLine("mul = {0}", res1 * res2);
            Console.WriteLine("Dıv = {0}", res1 / res2);
            Console.WriteLine("mod = {0}", res1 % res2);
        }
    }
}
