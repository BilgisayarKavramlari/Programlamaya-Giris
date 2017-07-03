using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ControlOfRightTriangle
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] number = new int[3];

            Console.Write("Enter the first number: ");
            number[0] = int.Parse(Console.ReadLine());

            Console.Write("Enter the second number: ");
            number[1] = int.Parse(Console.ReadLine());

            Console.Write("Enter the third number: ");
            number[2] = int.Parse(Console.ReadLine());

            int max = 0, index = 0;

            for (int i = 0; i < 3; i++)
            {
                if(number[i] > max)
                {
                    max = number[i];
                    index = i;
                }          
            }

            int hypotenuse = 0;

            for (int i = 0; i < 3; i++)
            {
                if(i != index)
                {
                    hypotenuse += number[i] * number[i];
                }
            }

            hypotenuse = Convert.ToInt32(Math.Sqrt(hypotenuse));

            if(hypotenuse == number[index])
                Console.WriteLine("This is a right triangle");
            else
                Console.WriteLine("This is not a right triangle");
        }
    }
}
