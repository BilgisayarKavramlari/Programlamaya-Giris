using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AylıkMesaiUcretiniHesaplayanKod
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, mesai,sonuc;
            Console.WriteLine("Fazla mesai saatini girin:");
            mesai = int.Parse(Console.ReadLine());
            i = 0;
            if (mesai < 10)
                i = 1;
            else if (mesai < 20)
                i = 2;
            else if (mesai < 40)
                i = 3;
            else if (mesai < 100)
                i = 4;
            else if (mesai < 200)
                i = 5;

            sonuc = mesai * i;
            Console.WriteLine("Bu ay ki mesai ücretiniz:" + sonuc+" TL");
            Console.ReadKey();

            

        }
    }
}
