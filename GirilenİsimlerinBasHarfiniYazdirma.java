package javaapplication2;
import java.util.*;
public class JavaApplication2 {
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
      String İsimlerinBasHarfleri = "";
       String isim;
   
   for(int i=1;i<=3;i++)
   {
   System.out.print("Lütfen "+i +". İsmi  Giriniz: ");
   isim=scan.nextLine();
   
   İsimlerinBasHarfleri+=isim.substring(0,1);
   
   }
   System.out.println(İsimlerinBasHarfleri);
  
   
}
}
