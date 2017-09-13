public class DizidekiOrtalama 
{
    public static void main(String[] args) 
    {
        int [] dizi = {1,2,3,4};
        double  toplam = 0;
        
        for (int i = 0; i < dizi.length; i++) 
        {
            toplam += dizi[i]; 
        }
        System.out.println("Dizideki elemanların aritmetik ortalaması = " + toplam/dizi.length);
    }   
}
