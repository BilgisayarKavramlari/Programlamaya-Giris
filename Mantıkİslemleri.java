package proje5;
import java.util.Scanner;

public class Proje5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        
        System.out.println("\t\t\t\t\t-----------------------");
        System.out.println("\t\t\t\t\tMantık İşlemleri Proje5");
        System.out.println("\t\t\t\t\t-----------------------");
        
        System.out.print("Bir Sayı Giriniz :");
        s1 = scan.nextInt();
        
        System.out.print("Bir Sayı Giriniz :");
        s2 = scan.nextInt();
        
        System.out.println("\t\t\t\t\t--------------------");
        System.out.println("\t\t\t\t\t  Mantık İşlemleri");
        System.out.println("\t\t\t\t\t--------------------");
        
        if(s1 == s2)
        {
            System.out.println(s1 + " Sayısı Eşittir " + s2 + " Sayısına");
        }
        
        else if(s1 < s2)
        {
            System.out.println(s1 + " Sayısı Küçüktür " + s2 + " Sayısından");
        }
        
        else if(s1 > s2)
        {
            System.out.println(s1 + " Sayısı Büyüktür " + s2 + " Sayısından");
        }
        
        else if(s1 <= s2)
        {
            System.out.println(s1 + " Sayısı Küçük Ve Eşittir " + s2 + " Sayısına");
        }
        
        // burda küçük ve eşittir kullanmam mantıksız bir işlem oldu
        
        else if(s1 >= s2)
        {
            System.out.println(s1 + " Sayısı Büyük Ve Eşittir " + s2 + " Sayısına");
        }
        
        else if(s1 != s2)
        {
            System.out.println(s1 + " Sayısı Eşittir Değildir " + s2 + " Sayısına");
        }
        
        else if(s2 != s1)
        {
            System.out.println(s2 + " Sayısı Eşittir Değildir " + s1 + " Sayısına");
        }
    }
    
}

