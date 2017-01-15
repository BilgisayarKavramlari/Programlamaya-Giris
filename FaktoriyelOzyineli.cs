using System;

class Program
{
    static int faktoriyel(int sayi)
    {
        return (sayi <= 1) ? 1 : faktoriyel(sayi - 1) * sayi;
    }

    static void Main(string[] args)
    {
        int sayi;

        Console.WriteLine("Faktöriyeli alınacak sayıyı giriniz:");
        sayi = int.Parse(Console.ReadLine());

        Console.WriteLine(faktoriyel(sayi));
    }
}
