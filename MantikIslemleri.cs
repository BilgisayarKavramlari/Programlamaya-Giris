  class Program
    {
        static void Main(string[] args)
        {
            //Kullanıcıdan birinci ve ikinci sayı alınıyor.Convert sınıfıyla int tipine dönüştürülerek değerler ilgili değişkenlere atanıyor. 
            Console.WriteLine("Birinci sayıyı girin: ");
            int sayi1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("İkinci sayıyı girin: ");
            int sayi2 = Convert.ToInt32(Console.ReadLine());
          
            /*Aşağıdaki koşul yapısında normalde else if koşul yapısı kullanılarak herhangi bir koşulun 
              gerçekleşmesi durumunda diğer koşul bloklarının atlanması sağlanabilirdi. 
              Ancak aynı anda birden fazla koşul örneklerinin görülebilmesi için sadece if yapısı kullanılmıştır. */
          
            //Değerlerin birbirine eşit olması durumu 
            if (sayi1 == sayi2)
                Console.WriteLine("Sayılar birbirine eşit.");
            //Değerlerin birbirine eşit olmaması durumu
            if (sayi1 != sayi2)
                Console.WriteLine("Sayılar birbirine eşit değil.");
            //Birinci sayının İkinci sayıdan küçük olması durumu
            if (sayi1 < sayi2)
                Console.WriteLine("{0} sayısı {1} sayısından küçüktür.", sayi1, sayi2);
            //Birinci sayının İkinci sayıdan büyük olması durumu
            if (sayi1 > sayi2)
                Console.WriteLine("{0} sayısı {1} sayısından büyüktür.", sayi1, sayi2);
            //Birinci sayının İkinci sayıdan küçük yada eşit olması durumu
            if (sayi1 <= sayi2)
                Console.WriteLine("{0} sayısı {1} sayısından küçük yada eşittir.", sayi1, sayi2);
            //Birinci sayının İkinci sayıdan büyük yada eşit olması durumu
            if (sayi1 >= sayi2)
                Console.WriteLine("{0} sayısı {1} sayısından büyük yada eşittir.", sayi1, sayi2);

            Console.ReadKey();
        }
    }
