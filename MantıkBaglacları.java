package proje6;
import java.util.Scanner;

public class Proje6
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int snc = 0;
        
        System.out.println("Mantıksal İşleminizi Seçiniz:\n"
                + "1-)İlk Girilen Sayı 2. Sayı ve 3. Sayı değerinin arasında mı?\n2-)"
                + "İlk Girilen Sayı 2. Sayı ile eşit ve 3. Sayıdan Küçük mü?\n3-)"
                + "İlk Girilen Sayı 2. Sayı veya 3. Sayıdan Büyük mü?\n4-)"
                + "Girilen Sayılar Birbirlerine Eşit mi?");
        
        System.out.print("İşlem Numarasını Giriniz:");
        snc = scan.nextInt();
        
        switch(snc)
        {
            case 1:
            {
                System.out.print("Birinci Sayıyını Giriniz :");
                s1 = scan.nextInt();
        
                System.out.print("İkinci Sayıyını Giriniz :");
                s2 = scan.nextInt();
        
                System.out.print("Üçüncü Sayıyını Giriniz :");
                s3 = scan.nextInt();
                
                //İlk Girilen Sayı 2. Sayı ve 3. Sayı değerinin arasında mı?
                
                if(s2 > s1 && s1 < s3)
                {
                    System.out.println("Birinci Sayı İkinci Ve Üçüncü Sayı Arasındadır.");
                }
                
                else
                {
                    System.out.println("Birinci Sayı İkinci Ve Üçün Sayı Arasında Değildir.");
                }
                
                break;
            }
            
            case 2:
            {
                System.out.print("Birinci Sayıyını Giriniz :");
                s1 = scan.nextInt();
        
                System.out.print("İkinci Sayıyını Giriniz :");
                s2 = scan.nextInt();
        
                System.out.print("Üçüncü Sayıyını Giriniz :");
                s3 = scan.nextInt();
                
                //İlk Girilen Sayı 2. Sayı ile eşit ve 3. Sayıdan Küçük mü?
                
                if(s1 == s2 && s1 < s3)
                {
                    System.out.println("Birinci Sayı İkinci Sayıya Eşit Üçüncü Sayıdan Küçüktür.");
                }
                
                else
                {
                    System.out.println("Birinci Sayı İkinci Sayı Eşit Değildir Ve Üçüncü Sayıdan Küçük Değildir");
                }
                
                break;
            }
            
            case 3:
            {
                System.out.print("Birinci Sayıyını Giriniz :");
                s1 = scan.nextInt();
        
                System.out.print("İkinci Sayıyını Giriniz :");
                s2 = scan.nextInt();
        
                System.out.print("Üçüncü Sayıyını Giriniz :");
                s3 = scan.nextInt();
                
                //İlk Girilen Sayı 2. Sayı veya 3. Sayıdan Büyük mü?
                
                if(s1 > s2 || s1 > s3)
                {
                    System.out.println("Birinci Sayı İkinci Ve Üçüncü Sayıdan Büyüktür");
                }
                
                else
                {
                    System.out.println("Birinci Sayı İkinci Ve Üçüncü Sayıdan Büyük Değildir");
                }
                
                break;
            }
            
            case 4:
            {
                System.out.print("Birinci Sayıyını Giriniz :");
                s1 = scan.nextInt();
        
                System.out.print("İkinci Sayıyını Giriniz :");
                s2 = scan.nextInt();
        
                System.out.print("Üçüncü Sayıyını Giriniz :");
                s3 = scan.nextInt();
                
                if(s1 == s2 && s1 == s3)
                {
                    System.out.println("Tüm Sayılar Birbirine Eşitdir.");
                }
                
                else
                {
                    System.out.println("Tüm Sayılar Birbirine Eşit Değildir.");
                }
            }
            
            break;
        }
  }
}
