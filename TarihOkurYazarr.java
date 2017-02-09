package bilgisayarkavramlari;
import java.util.Scanner;
public class BilgisayarKavramlari {
    public static void main(String[] args) {
        Scanner tarihGir = new Scanner(System.in);
        System.out.print("Lütfen günü giriniz: ");
        int gun = tarihGir.nextInt();
        System.out.print("Lütfen ayı giriniz: ");
        int ay = tarihGir.nextInt();
        System.out.print("Lütfen yılı giriniz: ");
        int yil = tarihGir.nextInt();
        System.out.println("Gün ay yıl :"+gun+"."+ay+"."+yil);
        System.out.println("Ay gün yıl :" +ay+"."+gun+"."+yil);
        System.out.println("Yıl ay gün :" +yil+"."+gun+"."+ay);
    }
    
}
