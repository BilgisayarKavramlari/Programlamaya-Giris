import java.util.Scanner;

public class MainClass {
       
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int num=scan.nextInt();
        int s=1;
        
        for(int i=0;i<num;i++)
        {    
             for(int j=0;j<num;j++)
             {
                System.out.print("*");
             }
            
             System.out.println();
        }
    }
}
