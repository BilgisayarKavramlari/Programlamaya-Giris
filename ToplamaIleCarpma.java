class ToplamaIleCarpma 
{
    static int carpma(int sayi1, int sayi2)
    {
        int sonuc = 0;
        
        for (int i = 1; i <= sayi1; i++) 
        {
         sonuc += sayi2;   
        }
        
        return sonuc;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Sonuç = " + carpma(3,4));
    }
}
