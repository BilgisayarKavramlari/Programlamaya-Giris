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

            // Carpim tablosu 
            
          
            for(int i=1;i<10;i++)
            {
                

                for(int j=1;j<10;j++)
                {

                    if (i == 1)
                    {
                        Console.ForegroundColor = ConsoleColor.Green;           // Burada ilk satırı (1,2,3.. ) renkli yapıp ekrana basıyoruz
                        if (i * j >= 10)
                            Console.Write(i * j + "    ");
                        else Console.Write(i * j + "     ");
                        Console.ResetColor();
                    }
                    else if (j == 1)
                    {                                                           // Burada ilk sutunu renkli yapiyoruz
                        Console.ForegroundColor = ConsoleColor.Green;
                        if (i * j >= 10)
                            Console.Write(i * j + "    ");
                        else Console.Write(i * j + "     ");
                        Console.ResetColor();
                    }
                    else {
                        Console.ForegroundColor = ConsoleColor.White;
                        if (i * j >= 10)                                        // Burada da, ara degerleri ekrana basiyoruz
                            Console.Write(i * j + "    ");
                        else
                            Console.Write(i * j + "     ");
                    }
                }
                Console.WriteLine("\n");
                 
            }

            

            Console.ReadKey();
        }   
    }
}
