import java.util.Arrays;
import java.util.Scanner;

public class TekSayilarinOrtalamasiJava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer sayiKontrol = 0;
        int sayi[] = {0};
        String donguKontrol;
        do {
            System.out.println("Bir Sayi Giriniz(Kapat yazarsanız İşleme Başlar)");
            donguKontrol = s.next();
            if ("kapat".equals(donguKontrol)) {
                sayi = Arrays.copyOf(sayi, sayi.length - 1);
                break;
            }
            sayi[sayiKontrol] = Integer.valueOf(donguKontrol);
            sayi = Arrays.copyOf(sayi, sayi.length + 1);
            sayiKontrol += 1;

        } while (!"kapat".equals(donguKontrol));
        int sayac=0,toplam=0;
        for (int i = 0; i < sayi.length; i++) {
            if ((sayi[i]%2)!=0) {
                sayac++;
                toplam+=sayi[i];
            }
        }
        System.out.println("Tek Sayıların Ortalaması :"+toplam/sayac);
                
    }
}
