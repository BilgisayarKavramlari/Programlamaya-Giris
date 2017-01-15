using System;

class Program
{
    static void Main(string[] args)
    {
        float mesafe, hiz, sure;

        //Mesafeyi alıyoruz.
        Console.WriteLine("Mesafeyi Giriniz (km):");
        mesafe = float.Parse(Console.ReadLine());

        //Hızı alıyoruz.
        Console.WriteLine("Hızı Giriniz (km/h):");
        hiz = float.Parse(Console.ReadLine());

        //Süreyi hesaplıyoruz.
        sure = mesafe / hiz;

        //Ne kadar sürede gidileceğini ekrana yazdırıyoruz.
        Console.WriteLine($"Süre: {sure} saat");
    }
}
