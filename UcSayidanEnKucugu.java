package bilgisayarkavramlari;
import java.util.Scanner;
public class BilgisayarKavramlari {
    public static void main(String[] args) {
        Scanner sayiGir = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = sayiGir.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = sayiGir.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int c = sayiGir.nextInt();
        
        if(a>b && b>c){
            System.out.println("En büyük sayi: "+a);
            System.out.println("En küçük sayi: "+c);
        }
        else if(a>b && c>b && a>c){
            System.out.println("En büyük sayi: "+a);
            System.out.println("En küçük sayi: "+b);
        }
        else if(b>a && a>c){
            System.out.println("En büyük sayi: "+b);
            System.out.println("En küçük sayi: "+c);
        }
        else if(b>a && c>a && b>c){
            System.out.println("En büyük sayi: "+b);
            System.out.println("En küçük sayi: "+a);
        }
         else if(c>a && a>b){
            System.out.println("En büyük sayi: "+c);
            System.out.println("En küçük sayi: "+b);
        }
        else if(c>a && b>a && c>b){
            System.out.println("En büyük sayi: "+c);
            System.out.println("En küçük sayi: "+a);
        }
        
    }
    
}
