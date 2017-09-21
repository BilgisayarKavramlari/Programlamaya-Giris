import java.util.Scanner;

public class YasHesabı 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bulunduğunuz yıl = ");
        int bYil = girdi.nextInt();
        System.out.print("Doğum yılınız = ");
        int dYil = girdi.nextInt();
        System.out.println("Yaşınız = " + (bYil - dYil));
    }   
}
