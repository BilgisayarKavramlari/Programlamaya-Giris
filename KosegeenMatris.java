package bilgisayarKavramlari;

import java.util.Scanner;

public class BilgisayarKavramlari {
    
    public static void main(String[] args) {
       System.out.print("Bir sayı giriniz: ");
       Scanner boyutGir = new Scanner(System.in);
       int n  = boyutGir.nextInt();
       int matris[][] = new int[n][n];
       
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j){
                   matris[i][j] = 1;
               }
               else
                   matris[i][j] = 0;
           }
    }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(matris[i][j]);
           }
           System.out.println();
       }
    }
}
