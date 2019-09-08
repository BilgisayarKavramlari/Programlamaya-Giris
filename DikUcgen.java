package dikUcgen;
import java.util.Scanner;


public class DikUcgen{

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number:");
    int a = scan.nextInt();
    for(int i=0;i<a;i++){
    	System.out.print("*");
      for(int j=a-i;j<a;j++){
    	System.out.print("*");
      }
      System.out.println("");
    }
    
    

  }




}
