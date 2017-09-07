package training1;

import java.util.Scanner;

public class KombinasyonFonksiyonu 
{
    public static void main(String[] args) 
    {
        double fak1 = 1,fak2 = 1,fak3 = 1;
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("1. Sayıyı Giriniz = ");
        int sayi1 = girdi.nextInt();
        System.out.print("2. Sayıyı Giriniz = ");
        int sayi2 = girdi.nextInt();
        
        for (int i = 1; i <= sayi1; i++) 
        {
            fak1 *= i;
        }
        for (int i = 1; i <= (sayi1-sayi2); i++) 
        {
            fak2 *= i;
        }
        for (int i = 1; i <= sayi2; i++) 
        {
            fak3 *= i;
        }
        
        System.out.println("C("+sayi1+","+sayi2+") = " + (double) (fak1 / (fak3*fak2)));
    }   
}
