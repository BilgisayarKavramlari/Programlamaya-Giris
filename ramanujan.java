import java.util.Scanner;

public class RamanujanSayisiJava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double sayi[] = new Double[4];
        for (int i = 0; i < sayi.length; i++) {
            System.out.println(i + 1 + ".Sayiyi Giriniz");
            sayi[i] = s.nextDouble();
        }
        String ramanujan;
        ramanujan = Math.pow(sayi[0], 3) + Math.pow(sayi[1], 3)
                == Math.pow(sayi[2], 3) + Math.pow(sayi[3], 3)
                ? "Ramanujan Sayılarıdır " : "Ramanujan Değildir";
        System.out.println(ramanujan);
    }
}
