using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Asal_Sayı_Yazdır
{
    class Program
    {
        static List<int> SayiKadarAsal(int n)
        {
            if (n < 1) { return null; }
            else
            {
                List<int> asallar = new List<int>();
                asallar.Add(2);
                int i = 3;
                int anahtar;
                for (int sayac = 1; sayac < n;)
                {
                    anahtar = 1;
                    foreach (int deger in asallar)
                    {
                        if (i % deger == 0) { anahtar = 0; break; }
                        //Bir sayı kendinden önceki asal sayılara bölünmüyorsa asaldır.
                    }
                    if (anahtar == 1)
                    {
                        asallar.Add(i);
                        sayac++;
                    }
                    i++;
                }
                return asallar;
            }
        }
        static List<int> SayiyaKadarAsal(int n)
        {
            if (n < 2) { return null; }
            else
            {
                List<int> asallar = new List<int>();
                asallar.Add(2);
                int i = 3;
                int anahtar;
                for (int sayac = 3; sayac <= n; sayac++)
                {
                    anahtar = 1;
                    foreach (int deger in asallar)
                    {
                        if (i % deger == 0) { anahtar = 0; break; }
                        //Bir sayı kendinden önceki asal sayılara bölünmüyorsa asaldır.
                    }
                    if (anahtar == 1)
                    {
                        asallar.Add(i);
                    }
                    i++;
                }
                return asallar;
            }
        }
        static void Main(string[] args)
        {
            Console.Write("Yapmak istediğiniz işlemi seçiniz:\n" +
                "1. Girilen sayı kadar asal sayı yazdır\n" +
                "2. Girilen sayıya kadar olan asal sayıları yazdır\n" +
                "1 / 2: ");
            int islem = int.Parse(Console.ReadLine());
            Console.WriteLine();
            switch (islem)
            {
                case 1:
                    Console.Write("Tamsayı giriniz: ");
                    int n = int.Parse(Console.ReadLine());
                    List<int> SayiKadar = new List<int>();
                    SayiKadar = SayiKadarAsal(n);
                    if (n > 0)
                    {
                        foreach (var deger in SayiKadar)
                        {
                            Console.Write(deger + " ");
                        }
                    }
                    else { Console.WriteLine("Lütfen pozitif tamsayı değer giriniz."); }
                    break;
                case 2:
                    Console.WriteLine("Tamsayı giriniz: ");
                    int i = int.Parse(Console.ReadLine());
                    List<int> SayiyaKadar = new List<int>();
                    SayiyaKadar = SayiyaKadarAsal(i);
                    if (i > 1)
                    {
                        foreach (var deger in SayiyaKadar)
                        {
                            Console.Write(deger + " ");
                        }
                    }
                    else { Console.WriteLine("En küçük asal sayı 2'dir. Lütfen 2 veya daha büyük bir tamsayı giriniz."); }
                    break;
            }
            Console.ReadKey();

        }
    }
}
