package bilgisayarKavramlari;

import java.util.Scanner;

public class BilgisayarKavramlari {
    
    public static void main(String[] args) {
       System.out.print("Boyut giriniz: ");
       Scanner boyutGir = new Scanner(System.in);
       int n = boyutGir.nextInt();
       int ct[][] = new int[n][n]; 
       
       for(int i=0;i<n;i++) //hesaplama döngüsü
           for(int j=0;j<n;j++)
               ct[i][j] = (i+1)*(j+1);
      
       for(int i=0;i<n;i++){ //bastırma döngüsü
           for(int j=0;j<n;j++){
               System.out.print(ct[i][j]);
           }
        System.out.println();
       }
    }  
}
