import java.util.Scanner;

public class YildizlaDikUcgen 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz = ");
        
        int satir = girdi.nextInt();
        int yildiz = satir;
        
        for (int i = 0; i < satir; i++) 
        {
            for (int j = 0; j < yildiz; j++) 
            {
                System.out.print("*");
            }
            yildiz--;
            System.out.println("");
        }
    }
}
