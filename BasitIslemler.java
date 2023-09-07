import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam;
        int fark;
        int carpim;
        double bolum;
        int kalan;

        System.out.print("Lütfen birinci sayıyı girin : ");
        int number1 = scanner.nextInt();
        System.out.print("Lütfen ikinci sayıyı girin : ");
        int number2 = scanner.nextInt();

        toplam = (number1 + number2);
        fark = (number1 - number2);
        carpim = (number1 * number2);
        bolum = ((double) number1 / number2);
        kalan = (number1 % number2);

        System.out.println("Toplam : " + toplam);
        System.out.println("Fark : " + fark);
        System.out.println("Çarpım : " + carpim);
        System.out.println("Bölüm : " + bolum);
        System.out.println("Kalan : " + kalan);

    }
}
