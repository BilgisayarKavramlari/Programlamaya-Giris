import java.util.Scanner;

public class HizProblemi 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz = ");
        int mesafe = girdi.nextInt();
        System.out.print("Hızı giriniz = ");
        int hiz = girdi.nextInt();
        System.out.println("Süre = " +(double) (mesafe/hiz) + " saattir");
    }   
}
