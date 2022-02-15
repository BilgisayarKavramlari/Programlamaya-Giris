import java.util.Scanner;

public class MainClass {
       
    public static void main(String[] args)
    {
        int a=1,b=0,sum=0;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sNum=scan.nextInt();
        
        for(int i=0; i<sNum; i++)
        {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
}
