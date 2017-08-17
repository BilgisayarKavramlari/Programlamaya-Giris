public class IlkYırmıMersenne
{
    public static void main(String[] args) 
    {
        double n = 1;
        for (byte i = 1; i <= 20; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                n = n * 2;
            }
            System.out.println(i + ". Mersenne Sayısı = " + (n-1));
            n = 1;
        }
    }
}
