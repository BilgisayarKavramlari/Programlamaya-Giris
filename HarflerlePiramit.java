import java.util.Scanner;

public class HarflerlePiramit 
{
    public static void main(String[] args) 
    {
        int sayi = 0, max = 65;
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Harf giriniz = ");
        String gelen = girdi.next();
        
        for (int i = 65; i < 91; i++) 
        {
            if (gelen.equalsIgnoreCase(String.valueOf(((char) i))))
            {
                sayi = i;
            }
        }
        
        for (int i = 65; i <= sayi; i++)
        {
            for (int j = 65; j <= max; j++) 
            {
                System.out.print((char) j);
            }
            max++;
            System.out.println("");
        }
    }   
}
