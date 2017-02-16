package bilgisayarkavramlari;
import java.util.Scanner;
public class BilgisayarKavramlari {
    public static void main(String[] args) {
        System.out.println("Notunuzu giriniz: ");
        Scanner notGir = new Scanner(System.in);
        int not = notGir.nextInt();
        if(not>=90){
            System.out.println("Harf Notunuz: A");
        }
        else if(not>=80){
            System.out.println("Harf Notunuz: B");
        }
        else if(not>=70){
            System.out.println("Harf Notunuz: C");
        }
        else{
            System.out.println("Harf Notunuz: F");
        }
        
    }
    
}
