
package polinom;

import java.util.Scanner;
public class polinom {

    public static int polinomHesabi(int a,int b,int c)    {   

       int carpim = (a*a) + (b*b) + (3*c);
       return carpim;
    }
    public static void main(String[] args) {
        int aDegeri,bDegeri,cDegeri;
        Scanner giris = new Scanner(System.in);
        System.out.println("a sayısını giriniz : ");
        aDegeri=giris.nextInt();
        System.out.println("b sayısını giriniz : ");
        bDegeri=giris.nextInt();
        System.out.println("c sayısını giriniz : ");
        cDegeri=giris.nextInt();
        
        System.out.println("Polinom sonucu = "+ polinomHesabi(aDegeri,bDegeri,cDegeri));
    }
    
}
