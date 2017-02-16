import java.util.Scanner;
public class MantikIslemleri {
    public static void main(String[] args) {
        System.out.print("Birinci sayıyı giriniz: ");
        Scanner sayiGir = new Scanner(System.in);
        int x = sayiGir.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        int y = sayiGir.nextInt();
        
        if(x!=y){
            System.out.println("Sayılar eşit değildir");
        }
        if(x==y){
            System.out.println("Sayılar eşittir");
        }
        if(x>y){
            System.out.println("Birinci sayı büyüktür");
        }
        if(x<y){
            System.out.println("İkinci sayı büyüktür");
        }
        if(x<=y){
            System.out.println("Birinci sayı küçük eşittir");
        }
        if(x>=y){
            System.out.println("Birinci sayı büyük eşittir");
        }
      
        
    }
    
}
