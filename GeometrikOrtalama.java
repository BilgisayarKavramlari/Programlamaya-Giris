public class GeometrikOrtalama 
{
    public static void main(String[] args) 
    {
        int [ ] dizi = {1,2,3,6};
        double  carpim = 1;
        
        for (int i = 0; i < dizi.length; i++) 
        {
            carpim *= dizi[i]; 
        }
        
        System.out.println("Dizideki elemnaların geometrik ortalaması = " + Math.sqrt(carpim));
    }   
}
