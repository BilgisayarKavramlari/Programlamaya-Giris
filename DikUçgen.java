package dik.üçgen;

import java.util.Scanner;

public class DikÜçgen {
    
    public static void main(String[] args) {
        int x,y,z,eb,m,p;
        System.out.println("Kenar Uzunluğu giriniz.");
        Scanner a =new Scanner(System.in);
        x=a.nextInt();
        System.out.println("Kenar Uzunluğu giriniz.");
        Scanner b =new Scanner(System.in);
        y=b.nextInt();
        System.out.println("Kenar Uzunluğu giriniz.");
        Scanner c =new Scanner(System.in);
        z=c.nextInt();
        if(x>y){
            if(x>z){
                eb=x;
                m=y;
                p=z;
            }
            else{
                eb=z;
                m=x;
                p=y;
            }
        }
        else{
            if(y>z){
                eb=y;
                m=x;
                p=y;
            }
            else{
                eb=z;
                m=x;
                p=y;
            }
        }
        if((m*m)+(p*p)==(eb*eb)){
            System.out.println("Dik Üçgendir.");
        }
        else{
            System.out.println("Dik Üçgen Değildir.");
        }
    }
}
