package bilgisayarkavramlari;
import java.util.Scanner;
public class BilgisayarKavramlari {
    public static void main(String[] args) {
        Scanner sayiGir = new Scanner(System.in);
        System.out.print("Birinci(a) sayıyı giriniz: ");
        int a = sayiGir.nextInt();
        System.out.print("İkinci(b) sayıyı giriniz: ");
        int b = sayiGir.nextInt();
        System.out.print("Üçüncü(c) sayıyı giriniz: ");
        int c = sayiGir.nextInt();
        if(a<b || a>c){
          System.out.println("a,b ile c arasında bir sayı değildir");  
        }
        if(a<b && a<c){
          System.out.println("a,b veya c'den daha büyük değildir");
        }
        if(a==b && a<c){
          System.out.println("a,b'ye eşit ve aynı zamanda c'den küçüktür");  
        }
        if(a!=b && b!=c){
           System.out.println("üç sayı birbirine eşit değildir"); 
        }
    }
    
}
