package com.company;


import java.util.Scanner;

import static java.util.concurrent.TimeUnit.*;

public class Main {

    public static void main(String[] args) {
	
        System.out.println("Bir tam sayı giriniz: ");
        int girilenSayi = scanner.nextInt();
        for (int i =1; i <= girilenSayi;i++){
            //yildiz string olusturma
            String yildizMetni = "";
            for (int j=0; j <i; j++){
                yildizMetni+="* ";
            }
            System.out.println(yildizMetni);

        }
    }
}
