package dikucgenhesaplama;

import java.util.Scanner;

public class DikUcgenHesaplama {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int k1, k2, alan, cevre;

        System.out.print("1.Kenarı Giriniz: ");
        k1 = tara.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        k2 = tara.nextInt();

        double hiphip = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));
        alan = (k1 * k2) / 2;
        cevre = (k1 + k2 + (int) hiphip);
        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + cevre);

    }

}
