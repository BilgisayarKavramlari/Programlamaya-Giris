package bilgisayarkavramlari;
import java.util.Scanner;
public class bilgisayarkavramlari {
    public static void main(String[] args) {
        Scanner sayiGir = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int birinciSayi = sayiGir.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int ikinciSayi = sayiGir.nextInt();
        System.out.println("Toplam: " +(birinciSayi+ikinciSayi));
        System.out.println("Fark :"+(birinciSayi-ikinciSayi));
        System.out.println("Çarpım :"+(birinciSayi*ikinciSayi));
        System.out.println("Bölüm :"+((double)birinciSayi/(double)ikinciSayi));
        System.out.println("Kalan: "+(birinciSayi%ikinciSayi));
    }
    
}
