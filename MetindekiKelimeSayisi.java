import java.util.Scanner;

public class MetindekiKelimeSayisi 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Metin giriniz = ");
        String metin = girdi.nextLine();
        int gecici, kelimeSayisi = 0;
        int uzunluk = metin.length();
        
        for (int i = 0; i < uzunluk; i++) 
        {
            gecici = i;
            gecici++;
                       
            if (metin.substring(i, gecici).equalsIgnoreCase(" ")) 
            {
                kelimeSayisi++;                
            }
        }
        
        kelimeSayisi++;
        System.out.println(metin);
        System.out.println("Metninde " + kelimeSayisi + " adet kelime vardır.");
    }
}
