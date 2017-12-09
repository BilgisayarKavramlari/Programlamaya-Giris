
import java.text.DecimalFormat;

public class MersenneJava {

    public static void main(String[] args) {
        Double sayi;
        DecimalFormat df = new DecimalFormat();
        for (int i = 1; i <= 20; i++) {
            sayi = Math.pow(2, i) - 1;
            System.out.println(" " + df.format(sayi));
        }
    }
}
