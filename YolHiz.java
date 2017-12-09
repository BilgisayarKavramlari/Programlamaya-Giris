import java.util.Scanner;


public class YolHizJava {
    
      public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          Double mesafe,hiz;
          System.out.println("Mesafeyi Giriniz:");
          mesafe=s.nextDouble();
          System.out.println("Hızı Giriniz");
          hiz=s.nextDouble();
          System.out.println("Süre "+mesafe/hiz+" saattir");
      
      }
}
