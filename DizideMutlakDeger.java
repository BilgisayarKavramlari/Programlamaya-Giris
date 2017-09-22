public class DizideMutlakDeger 
{
    public static void main(String[] args) 
    {
        int gecici , toplam = 0;
        int [] dizi = {7,-3,-2,5,0,-20};
        for (int i = 0; i < dizi.length; i++) 
        {
            gecici = i;
            toplam += Math.abs(dizi[i]) + Math.abs(dizi[gecici++]);
        }
        System.out.println("Toplam = " + toplam);
    }   
}
