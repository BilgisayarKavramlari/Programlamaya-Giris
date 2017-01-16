package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int i1 = 1, i2 = 1, bs, artis;
        Scanner tara = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        bs = tara.nextInt();
        System.out.print(i1 + " " + i2 + " ");
        for (int i = 2; i < bs; i++) {
            artis = i1 + i2;
            System.out.print(artis + " ");
            i1 = i2;
            i2 = artis;

        }
    }

}
