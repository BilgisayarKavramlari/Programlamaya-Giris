package combination;

import java.util.Scanner;

public class Combination {
    
    static int c(int x){
        if(x==1) return 1;
        if(x==0) return 1;
        return x*c(x-1);
    }
    public static void main(String[] args) {
        int x,y,m;
        System.out.println("Büyük değeri giriniz.");
        Scanner a = new Scanner(System.in);
        x = a.nextInt();
        System.out.println("Küçük değeri giriniz.");
        Scanner b = new Scanner(System.in);
        y = b.nextInt();
        if(x<y)
            System.out.println("İlk değer daha büyük olmalıdır");
        else{
        m = c(x)/(c(y)*c(x-y));
        System.out.println("Sonuç: "+ m);
        }
    }
}
