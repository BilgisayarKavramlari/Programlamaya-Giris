package bilgisayarkavramlari;
import java.util.Scanner;
public class BilgisayarKavramlari {
    public static void main(String[] args) {
        Scanner sayiGir = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = sayiGir.nextInt();
        System.out.println("Girdiğiniz sayı: "+sayi);
    }
    
}
