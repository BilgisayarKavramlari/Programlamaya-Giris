package ekrandansayioku;

import java.util.Scanner;

public class EkrandanSayiOku {

    public static void main(String[] args) {
        int x; // sayınının tutulduğu değişken
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        x = oku.nextInt();

        System.out.print("Girilen Sayı: " + x);

    }
}
