
import java.util.Scanner;

public class GirilenSayiyaKadarOlanSayilarinKareleriJava {
      public static void main(String[] args) {
          Scanner s= new Scanner(System.in);
          Integer sayi;
          System.out.println("Bir Sayi Giriniz:");
          sayi=s.nextInt();
          for (int i = 1; i <= sayi; i++) {
              System.out.println(" "+Math.pow(i, 2));
          }
          
      }
}
