import java.util.Scanner;

public class Fahrenheit 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Celcius değerini giriniz = ");
        int celcius = girdi.nextInt();
        System.out.println(celcius+ " Celcius'un Fahrenheit karşılığı = "+((celcius * 1.8) + 32));
    }
}
