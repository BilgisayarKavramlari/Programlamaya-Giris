import java.util.Scanner;

public class IsimOkutma 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("İsminizi giriniz = ");
        String isim = girdi.nextLine();
        
        System.out.println("Merhaba, " + isim);
    }
}
