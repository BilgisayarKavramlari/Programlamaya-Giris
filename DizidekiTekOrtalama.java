public class DizidekiTekOrtalama 
{
    public static void main(String[] args) 
    {
        int [] dizi = {1,2,3,4};
        double  toplam = 0, sayac = 0;
        
        for (int i = 0; i < dizi.length; i++) 
        {
            if (dizi[i] % 2 == 1) 
            {
                toplam += dizi[i]; 
                sayac++;
            }
        }
        System.out.println("Dizideki tek sayıların aritmetik ortalaması = " + toplam/sayac);
    }   
}
