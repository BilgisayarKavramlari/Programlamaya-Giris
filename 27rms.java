
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication1 {

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
        sayilariYazdir(sayi);
        sayi = sayilarinKareleriniYazdir(sayi);
        karelerinOrtalamasiniYazdir(sayi);
    }

    public static void sayilariYazdir(int sayi[]) {
        System.out.println("Sayilar: ");
        for (int i = 0; i < sayi.length; i++) {
            System.out.print(" " + sayi[i]);
        }
    }

    public static int[] sayilarinKareleriniYazdir(int sayi[]) {
        System.out.println("\n Kareleri: ");

        for (int i = 0; i < sayi.length; i++) {
            Double d = Math.pow(sayi[i], 2);
            System.out.print(" " + d.intValue());
            sayi[i] = d.intValue();
        }
        return sayi;
    }

    public static void karelerinOrtalamasiniYazdir(int sayi[]) {
        StringBuffer sb = new StringBuffer("(");
        System.out.println("\nOrtalamaları: ");
        for (int i = 0; i < sayi.length; i++) {
            sb.append(sayi[i] + "+");
        }
        double ortalama = Arrays.stream(sayi).average().getAsDouble();
        int sayitoplam = Arrays.stream(sayi).sum();
        Double karekok = Math.sqrt(ortalama);
        sb.append(")/" + sayi.length + "=" + sayitoplam + "/"
                + sayi.length + "=" + ortalama + "\n");
        sb.append("Karekökü:kök(" + ortalama + ")=" + karekok + " olarak bulunur.");
        System.out.println(sb);
    }
}
