import java.util.Scanner;

public class MainClass {
       
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Çarpım tablosu için 1. sayı: ");
        int num1=scan.nextInt();
        System.out.println("Çarpım tablosu için 2. sayı: ");
        int num2=scan.nextInt();
        
        for(int i=1;i<=num1;i++)
        {
            for(int j=1;j<=num2;j++)
            {
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
    }
}
