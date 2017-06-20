package com.example24;
/**
 * Created by asus1 on 20.6.2017.
 */
public class evenNumber {
    public static void main(String[] args) {

        int[] dizi = {2, 4, -1, 7, 98, 5};

        int max = 0, min = 1000;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                if (dizi[i] > max) {
                    max = dizi[i];
                }
                if (dizi[i] < min) {
                    min = dizi[i];
                }
            }
        }

        evenNumber obj = new evenNumber();
        int sonuc=obj.ortalama(max,min);
        System.out.println("Ortalama: "+sonuc);
    }

    public int ortalama(int max, int min) {

        int ortalama = (max + min) / 2;

        return ortalama;
    }
}
