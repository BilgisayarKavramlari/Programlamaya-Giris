class Program 
{
  static void Main(string[] args) 
  {
    Console.WriteLine("Birinci kenar uzunluğunu girin: ");
    int birinciKenar = Convert.ToInt32(Console.ReadLine());
    
    Console.WriteLine("İkinci kenar uzunluğunu girin: ");
    int ikinciKenar = Convert.ToInt32(Console.ReadLine());
    
    /* Math sınıfının Pow metoduyla kenarların kareleri hesaplanıyor. 
    Ardından Sqrt metoduyla sonucun karekökü hesaplanıyor. */
    int hipotenus = (int) Math.Sqrt(Math.Pow(birinciKenar,2) + Math.Pow(ikinciKenar,2));
    
    Console.WriteLine("Hipotenüs Uzunluğu: {0}", hipotenus);
    Console.ReadKey();
  }
}
