package kosegenmatris;
import java.util.Scanner;

public class KosegenMatris {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz ");
        int a = s.nextInt();
        System.out.println("");
        int matris [][] = new int [a][a];
        
            for(int i = 0; i<a; i++){
            
                for(int j = 0; j<a; j++){
                
                    matris[i][j] = 0;
                    if(i == j)
                        matris[i][j] = 1;
                }
            }
            for(int i = 0; i<a; i++){
                    for(int j = 0; j<a; j++){
                        System.out.print(matris[i][j]+"\t");
                    }
                    System.out.println("");
       }
    }
 }
