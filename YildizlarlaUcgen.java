public class YildizlarlaUcgen 
{
    public static void main(String[] args) 
    {
        byte a = 1;
        
        for (byte i = 1; i <= 5; i++) 
        {
            for (byte j = 1; j <= a; j++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
            a++;
        }
    }
}
