import java.util.Scanner;

public class IkinciDerecedenPolinom 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("a sayısını giriniz = ");
        int a = girdi.nextInt();
        System.out.print("b sayısını giriniz = ");
        int b = girdi.nextInt();
        System.out.print("c sayısını giriniz = ");
        int c = girdi.nextInt();
        
        System.out.println("Sonuç = " + ((a*a) + (b*b) + (3*c)));
    }   
}
