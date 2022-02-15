import java.util.Scanner;

public class MainClass {
       
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num1=scan.nextInt();
        
        for(int i=0;i<num1;i++)
        {
            for(int j=0;j<num1;j++)
            {
                if(i==j)
                {
                    System.out.print("1");
                }
                else
                System.out.print("0");
            }
            System.out.println();   
        }
    }
}
