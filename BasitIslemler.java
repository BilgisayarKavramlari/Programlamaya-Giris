package basitislemler;

import java.util.Scanner;

public class BasitIslemler {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int sayi1, sayi2, toplam, fark, carpim, kalan;
        double bolum;

        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1 = a.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = a.nextInt();
        toplam = sayi1 + sayi2;
        fark = sayi1 - sayi2;
        carpim = sayi1 * sayi2;
        bolum = (double) sayi1 / sayi2;
        kalan = sayi1 % sayi2;
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Carpim: " + carpim);
        System.out.println("Bolum: " + bolum);

        System.out.println("Kalan: " + kalan);

    }

}
