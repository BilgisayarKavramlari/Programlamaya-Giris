package training1;

import java.util.Scanner;

public class Hipotenus 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz = ");
        int kenar1 = girdi.nextInt();
        System.out.print("İkinci kenarı giriniz = ");
        int kenar2 = girdi.nextInt();
        System.out.println("Hipotenüs = " +(double) (Math.sqrt((kenar1*kenar1) + (kenar2*kenar2))));
    }   
}
