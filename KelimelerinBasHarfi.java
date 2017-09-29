import java.util.Scanner;

public class KelimelerinBasHarfi 
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        String bHarfler = "";
        String metin = "";
        
        do
        {
            System.out.print("Metin giriniz = ");
            metin = girdi.nextLine();
            
             if (metin.equalsIgnoreCase("0"))
                break;
             
            bHarfler += metin.substring(0, 1);
        }
        while(true != metin.equalsIgnoreCase("0"));
        
        System.out.println(bHarfler);
    }
}

/*
  0(sıfır) girilmediği sürece girilen kelimelerin baş harflerini yan yana yazdıran kod
*/
