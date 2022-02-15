import java.util.Scanner;

public class MainClass {
       
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int num=scan.nextInt();
        
        for(int i=1;i<=num;i++){
            
            for(int j=num;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
