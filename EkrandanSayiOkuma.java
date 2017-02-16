package ekrandansayiokuma;

import java.util.Scanner;

public class EkrandanSayiOkuma {

    public static void main(String[] args) {
        int sayi;
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        sayi = oku.nextInt();

        System.out.print("Girilen Sayı: " + sayi);

    }
}
