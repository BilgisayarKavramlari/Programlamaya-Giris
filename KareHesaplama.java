import java.util.Scanner;

class KareHesaplama
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double toplam = 0;
        
        System.out.print("1'den büyük tam sayı giriniz = ");
        int girilenSayi = input.nextInt();
        
        for (int i = 1; i <= girilenSayi; i++) 
        {
            toplam += (i*i);
        }
        
        System.out.println(girilenSayi + " sayısından, girilen tam sayıya kadar olan sayıların karelerinin toplamı = " + toplam);
    }
}
