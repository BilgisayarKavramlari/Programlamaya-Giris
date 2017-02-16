import java.util.InputMismatchException;
import java.util.Scanner;


public class HarfNotu {
    
    // scanner klavyeden bir integer okur
    // okunanan deger geri döndürülür
    public static int sayiOku() {
        int sayi;
        while(true){
            try {
            System.out.println("Notunuzu Giriniz (0-100 arası) : ");
            Scanner oku = new Scanner(System.in); // klavyeden deger okuyacak nesne
            sayi = oku.nextInt();
            // sayi 0-100 arası değilse continue ile while döngüsüne geri dön
            if (sayi < 0 || sayi >100) { 
                System.out.println("Hatalı Giriş (0-100 arası bir sayi girin!)");
                continue;
            }
            // sayi 0-100 arası ve exception olmadıysa döngüden break ile çık.
            // girilen deger integer değilse break işletilmez. catch ile hata yakalanır ve döngüye geri dönülür.
            break;
            } catch (InputMismatchException e) {
                System.out.println("Lütfen 0-100 arası bir sayi girin");
            }
        }
        return sayi;
    }
    
    // param int sayi 0-100 arası bir sayidir
    // bu degere karsilik harf notu hesaplanir
    private static char harfBul(int sayi) {
        
        if (sayi >= 90 && sayi <= 100) {
            return 'A';
        }else if (sayi >=80 && sayi <= 89){
            return 'B';
        }
        else if (sayi >= 70 && sayi <= 79){
            return 'C';
        }
        else {
            return 'F';
        }
        
    }
    
    public static void main(String[] args) {
        
        int sayi = sayiOku();
       
        char alinanHarf = harfBul(sayi);
        System.out.println("Harf Notunuz: "+ alinanHarf);
    }
    
}
