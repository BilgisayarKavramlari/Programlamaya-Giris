import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/15/17.
 */
public class TarihOkurYazar {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.printf("Lütfen günü giriniz: ");
        int gun = read.nextInt();
        System.out.printf("Lütfen ayı giriniz: ");
        int ay = read.nextInt();
        System.out.printf("Lütfen yılı giriniz: ");
        int yil = read.nextInt();

        if (ay < 10 && ay > 0 && gun >= 10) {
            System.out.println("Gün ay yıl: " + gun + "." + "0" + ay + "." + yil);
            System.out.println("Ay gün yıl: " + "0" + ay + "." + gun + "." + yil);
            System.out.println("Yıl ay gün: " + yil + "." + "0" + ay + "." + gun);
        } else if (gun < 10 && gun > 0 && ay >= 10) {
            System.out.println("Gün ay yıl: " + "0" + gun + "." + ay + "." + yil);
            System.out.println("Ay gün yıl: " + ay + "." + "0" + gun + "." + yil);
            System.out.println("Yıl ay gün: " + yil + "." + "0" + ay + "." + "0" + gun);
        }else if (gun < 10 && gun > 0 && ay < 10 && ay > 0){
            System.out.println("Gün ay yıl: " + "0" + gun + "." +"0"+ ay + "." + yil);
            System.out.println("Ay gün yıl: " + "0"+ ay + "." + "0" + gun + "." + yil);
            System.out.println("Yıl ay gün: " + yil + "." + "0" + ay + "." + "0" + gun);

        }
    }
}
