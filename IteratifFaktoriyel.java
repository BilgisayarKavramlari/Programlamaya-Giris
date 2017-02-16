package iterative.faktöriyel;

import java.util.Scanner;

public class IterativeFaktöriyel {

    public static void main(String[] args) {
        int x,y=1;
        System.out.println("Sayı Giriniz.");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for(int i=1;i<(x+1);i++){
            y *= i;
        }
        System.out.println("Sonuç: "+y);
    }
    
}
