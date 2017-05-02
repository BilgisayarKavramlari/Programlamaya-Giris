package bilgisayarKavramlari;

import java.util.Scanner;

public class BilgisayarKavramlari {
    
    public static void main(String[] args) {
       System.out.print("Bir sayı giriniz: ");
       Scanner sGir = new Scanner(System.in);
       int s = sGir.nextInt();
       String ss[][] = new String[s][s];
       
       for(int i=0;i<s;i++){
           for(int j=0;j<s;j++){
               if(i>=j)
                   ss[i][j]="*";
               else
                   ss[i][j]="";
           }
       }
       for(int i=0;i<s;i++){
           for(int j=0;j<s;j++){
              System.out.print(ss[i][j]);
           }
        System.out.println();
       }
    }
}
