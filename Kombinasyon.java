
package kombinasyon;
import java.util.Scanner;
public class kombinasyon {

    public static long faktHesapla(long a)
    {
        long faktoriyel = 1;
        for(long i=1;i<=a;i++)
        {
           faktoriyel*=i;
        }
        return faktoriyel;
    }

    public static void main(String[] args) {

        int n,r;
        Scanner input = new Scanner(System.in);
        System.out.println("n sayısını giriniz = ");
        n = input.nextInt();
        System.out.println("r sayısını giriniz = ");
        r = input.nextInt();
        
       long nFakt = faktHesapla(n);
       long rFakt= faktHesapla(r);
       long nrFarkiFakt=faktHesapla(n-r);
       long payda = nrFarkiFakt * rFakt;
       long kombinasyon = nFakt / payda;

       System.out.println("Kombinasyon = " + kombinasyon);
    }
    
}
