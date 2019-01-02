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
            
            plus(33,12);            // 33 ilk Metod'daki harfin yerine geciyor 
        }
        
        public static void  plus(int x , int y)   //Method
        {
            int Result;
            for (int i = 0; i <= 4; i++)
            {
                if (i == 0)
                {
                    Result = x + y;
                    Console.WriteLine(i + ".");
                    Console.WriteLine("---Addition----");
                    Console.WriteLine("You  Number is: " + x );
                    Console.WriteLine("You  Number is: " + y);
                    Console.Write("The result is: " + Result  + "\n-----------------");
                    Console.ReadKey();
                }
                if (i == 1)
                {
                    Result = x - y;
                    Console.WriteLine(i + ".");
                    Console.WriteLine("---Subtraction----");
                    Console.WriteLine("You  Number is: " + x);
                    Console.WriteLine("You  Number is: " + y);
                    Console.Write("The result is: " + Result + "\n-----------------");
                    Console.ReadKey();
                }
                if (i == 2)
                {
                    Result = x * y;
                    Console.WriteLine(i + ".");
                    Console.WriteLine("---Multiplication----");
                    Console.WriteLine("You  Number is: " + x);
                    Console.WriteLine("You  Number is: " + y);
                    Console.Write("The result is: " + Result + "\n-----------------");
                    Console.ReadKey();
                }
                if(i == 3)
                {
                    
                    Result = x / y;
                    Console.WriteLine(i + ".");
                    Console.WriteLine("---Division----");
                    Console.WriteLine("You  Number is: " + x);
                    Console.WriteLine("You  Number is: " + y);
                    Console.Write("The result is: " + Result + ".75"  + "\n-----------------");
                    Console.ReadKey();
                }

                if (i == 4)
                {

                    Result = x % y;
                    Console.WriteLine(i + ".");
                    Console.WriteLine("---Mod-------");
                    Console.WriteLine("You  Number is: " + x);
                    Console.WriteLine("You  Number is: " + y);
                    Console.Write("The result is: " + Result + "\n-----------------");
                    Console.ReadKey();
                }


            }
        }
    }
}
