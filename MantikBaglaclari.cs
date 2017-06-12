class Program
	{
		public static void Main(string[] args)
		{
			
            int a,b,c;
            Console.Write("a değeri : ");
            a = Convert.ToInt32(Console.ReadLine());

            Console.Write("b değeri : ");
            b = Convert.ToInt32(Console.ReadLine());

            Console.Write("c değeri : ");
            c = Convert.ToInt32(Console.ReadLine());

			
	    // a'nın b ve c arasında olup olmadığını kontrol et
	    if (a<b&&a>c||a>b&&a<c)
	    {
		Console.WriteLine("a, b ve c arasında bir sayı ");
	    }
	    
	   else
	   {
		Console.WriteLine("a,b ve c arasında bir sayı değildir ");
	   }
	   
	   //a'nın b'ye eşit ve c'den küçük olup olmadığını kontrol et
	   if(a==b&&a<c)
	   {
		Console.WriteLine("a, b'ye esit ve c'den küçüktür ");
	     }
	   //a'nın b'ye esit ve c'den büyük olup olmadığını kontrol et
	     if(a==b&&a>c)
	     {
		  Console.WriteLine("a, b'ye esit ve c'den büyüktür");
	    }
	   // a , b'den veya c'den büyük olup olmadığını kontrol et
	     if(a>b||a>c)
	     {
		Console.WriteLine("a, b'den veya c'den büyük ");
	     }
	     
	    else
	    {
		Console.WriteLine("a, b'den veya c'den küçük ");
        }
	    
	   // Üçününde birbirine esit olup olmadığını kontrol et
	   if(a==b&&a==c)
	   {
		Console.WriteLine("Sayılar eşittir ");
	   }
	  else 
	   {
		Console.WriteLine("Sayılar esit değildir ");
	   }
	Console.ReadLine();
}
			
		
		}
