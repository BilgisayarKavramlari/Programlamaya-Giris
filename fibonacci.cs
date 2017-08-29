using System;

class FibonacciDizisi
{
    static void Main(string[] args)
    {
        int sayi, a = 0, b = 1, toplam = 0;

        //Kullanıcıdan ekrana kaç tane sayı yazdıracağımı istiyoruz.
        sayi = Convert.ToInt32(Console.ReadLine());
        
        //ilk 2 elemanı yazdırıyoruz.
        Console.WriteLine(a + "\n" + b);

        for (int i = 0; i < sayi - 2; i++) //ilk iki elamanı yazdırdığımız için sayı değişkeninin 2 eksiğini alıyoruz.
        {
            toplam = a + b;
            Console.WriteLine(toplam);
            a = b;
            b = toplam;
        }
    }
}