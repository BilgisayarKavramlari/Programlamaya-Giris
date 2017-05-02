package bilgisayarKavramlari;

import java.util.Scanner;

public class BilgisayarKavramlari {
    public static void main(String[] args) {
       Scanner kenarGir = new Scanner(System.in);
       double kisaKenar,uzunKenar,hipo;
       System.out.print("Kısa kenar giriniz: ");
       kisaKenar = kenarGir.nextDouble();
       System.out.print("Uzun kenar giriniz: ");
       uzunKenar = kenarGir.nextDouble();

       hipo = Math.sqrt((uzunKenar*uzunKenar)+(kisaKenar*kisaKenar));
       System.out.println("Hipotenüs: "+hipo);              
    }
}
