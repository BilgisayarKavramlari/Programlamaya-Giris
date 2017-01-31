class Program
{
   static void Main(string[] args)
   {
      Console.WriteLine("Bir işçinin bir işi bitirme süresini giriniz: ");
      int birIsciSuresi = int.Parse(Console.ReadLine());
      
      Console.WriteLine("Toplam çalışacak işçilerin sayısını giriniz: "); 
      int toplamIsciSayisi = int.Parse(Console.ReadLine());
      
      int isBitirmeSuresi = (birIsciSuresi / toplamIsciSayisi);
      
      Console.WriteLine("İşin bitirilme süresi {0} gündür.", isBitirmeSuresi);
      Console.ReadKey(); 
   }
}
