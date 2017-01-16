package ucsayidanenbuyugu;

import java.util.Scanner;

public class UcSayidanEnBuyugu {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = oku.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = oku.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        sayi3 = oku.nextInt();
        int buyuksayi = sayi1, kucuksayi = sayi1;

        if (sayi3 > sayi2 && sayi3 > sayi1) {
            buyuksayi = sayi3;
        } else if (sayi2 > sayi3 && sayi2 > sayi1) {
            buyuksayi = sayi2;
        }

        if (sayi2 < sayi1 && sayi2 < sayi3) {
            kucuksayi = sayi2;
        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            kucuksayi = sayi3;

        }

        System.out.println("En Büyük Sayı: " + buyuksayi);
        System.out.print("En Küçük Sayı: " + kucuksayi);
    }

}
