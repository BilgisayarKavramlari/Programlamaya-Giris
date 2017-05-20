namespace Carpimtablosu
{
    class carpim    
    {
        static void Main(string[] args)
        {

            for (int i = 0; i <= 10; i++)
            {
              
                for (int j = 0; j <= 10; j++)
                {
                    Console.WriteLine("{0} x {1} = {2} \n" ,i,j,(i*j));
                }
                Console.WriteLine("_______________________________\n");
            }
            Console.ReadLine();
        }
    }
}
