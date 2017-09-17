import java.util.Scanner;

public class GirilenSayiKaresi 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int gSayi = girdi.nextInt();
        
        int toplam = 0;
        
        for (int i = 1; i <= gSayi; i++) 
        {
            toplam += (i*i);
        }
        System.out.println("Sonuç = " + toplam);
    }   
}
