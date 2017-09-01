import java.util.Scanner;

public class DikUcgenAlanVeCevre 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz = ");
        int kenar1 = girdi.nextInt();
        System.out.print("İkinci kenarı giriniz = ");
        int kenar2 = girdi.nextInt();
        System.out.println("Üçgenin Alanı = " + (kenar1*kenar2)/2 );
        System.out.println("Üçgenin Çevresi = " + (kenar1+kenar2+(double) (Math.sqrt((kenar1*kenar1) + (kenar2*kenar2)))));
    }   
}
