namespace enbuyukenkucuk
{
    class buyukucuk
    {
       
        static void Main(string[] args)
        {
            int  sayi,adet;             //girdiğimiz sayıyı ve sayı adedini tutacak değişkenler
            int[] sayilar;              //sayı adedini aktaracağımız sayilar dizisi
            Console.Write("Kaç adet sayı girilecek? = ");   
            adet=int.Parse(Console.ReadLine());     //sayı adedi girişi
            sayilar = new int[adet];                //sayilar dizisinin uzunluğunu sayı adedi olarak belirledik
            for (int i = 0; i < adet; i++)          // 0 dan girdiğimiz adede kadar sayacak
            {   
                Console.Write("{0}.Sayıyı Giriniz= ",(i+1));        
                sayi =  Convert.ToInt32(Console.ReadLine());    //döngü içinde sayıları alacağımız alan
                sayilar[i] = sayi;                              //burda girdiğimiz sayıları diziye aktarıyoruz

          
            }
            Console.WriteLine("\nEn büyük sayı= {0} \nEn küçük sayı= {1} ", sayilar.Max(),sayilar.Min());     //dizimizin max ve min fonksiyonları ile sayılarımızı ekrana yazdırıyoruz.
            Console.ReadLine();
        }

    }
}
