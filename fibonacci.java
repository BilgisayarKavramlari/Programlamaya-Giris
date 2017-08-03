package javaapplication21;

import java.util.Scanner;



public class JavaApplication21 {
       
     public static void main(String[] args) {
         System.out.print("Fibonacci olusturmak istediginiz sayiyi giriniz: ");
         Scanner s = new Scanner(System.in);
         int i = s.nextInt();
         System.out.print(""+1+" ");
         int sayi1=1;
         int sayi2=1;
         int sayi3;
         for(int k=0;k<i;k++){//1 1 2 3 5
              sayi3 = sayi1+sayi2;
              sayi1=sayi2;
              sayi2=sayi3;
              System.out.print(""+sayi1+" ");         

             
         }
     }

}
