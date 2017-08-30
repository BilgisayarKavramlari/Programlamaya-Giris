import java.util.Scanner;

public class KosegenMatris 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Matris boyutunu giriniz = ");
        int a = girdi.nextInt();
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                if (i == j) 
                {
                    System.out.print("1");
                } 
                else 
                {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
