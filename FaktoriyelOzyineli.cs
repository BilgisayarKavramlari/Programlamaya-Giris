using System;

class Program
{
    static int faktoriyel(int sayi)
    {
        // Sayı 1'e eşit olana kadar fonksiyon tekrar ediyor ve ardından düğüm çözülüyor.
        return (sayi <= 1) ? 1 : faktoriyel(sayi - 1) * sayi;
    }

    static void Main(string[] args)
    {   
        // Ekrana sayı girilmesini belirten mesajı veriyoruz.
        Console.WriteLine("Faktöriyeli alınacak sayıyı giriniz:"); 
        
        // Kullanıcıdan girilen değer sayi ismindeki değişkene alıyoruz.
        int sayi = int.Parse(Console.ReadLine());
        
        // Recursive fonksiyonumuzu kullanarak ekrana istenilen sayının faktöriyelini yazdırıyoruz.
        Console.WriteLine(faktoriyel(sayi));
    }
}
