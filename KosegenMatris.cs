using System;

class Program
{
    static void Main(string[] args)
    {
        int MatrisBoyutu;

        Console.WriteLine("Matris boyutunu giriniz:");
        MatrisBoyutu = int.Parse(Console.ReadLine());

        for (int satir = 0; satir < MatrisBoyutu; satir++) //Satır
        {
            for (int kolon = 0; kolon < MatrisBoyutu; kolon++) //Kolon
            {
                // Satır no ile Kolon no eşitse 1(bir) değilse 0(sıfır) yazdırıyoruz.
                // Burada if-else yapısını kullanabilirdik ama pratik olması açısından Ternary operatörünü kullandık.
                Console.Write((satir == kolon) ? "1" : "0");
            }
            Console.WriteLine(); //Alt satıra geçiyoruz.
        }
    }
}
