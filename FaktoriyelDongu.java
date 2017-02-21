package faktoriyeldongu;

import java.util.Scanner;

public class FaktoriyelDongu {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int sayi, fc = 1;
        System.out.print("Bir Sayi Girin");
        sayi = tara.nextInt();

        //Başlangıç değeri 2 olması neden 1 sayısının çarpımda etkisi olmamasıdır.
        for (int i = 2; i <= sayi; i++) {
            fc *= i;
            /*ilk döngü tekrarında örnek sayı 5 girilmiş ise
           (1)fc=1*2
            (2)fc=2*3
            (6)fc=6*4
           (24) fc=24*5
            sonuc 120 olacak.
             */

        }
        System.out.println("Sayının Faktöriyeli: " + fc);

    }

}
