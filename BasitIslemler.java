import java.util.Scanner;

public class BasitIslemler 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz = ");
        int sayi1 = girdi.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz = ");
        int sayi2 = girdi.nextInt();
        System.out.println("Toplam = " + (sayi1 + sayi2));
        System.out.println("Fark = " + (sayi1 - sayi2));
        System.out.println("Çarpım = " + (sayi1 * sayi2));
        System.out.println("Bölüm = " + (double) (sayi1 / sayi2));
        System.out.println("Kalan = " + sayi1%sayi2);
    }   
}
