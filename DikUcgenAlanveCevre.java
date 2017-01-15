import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/15/17.
 */
public class DikUcgenAlanveCevre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("birinci kenarı giriniz: ");
        int birinciKenar = sc.nextInt();
        System.out.printf("ikinci kenarı giriniz: ");
        int ikinciKenar = sc.nextInt();
        int alan = (birinciKenar * ikinciKenar) / 2;
        int cevre = (int) (Math.sqrt(Math.pow(birinciKenar, 2) + Math.pow(ikinciKenar, 2)) + birinciKenar + ikinciKenar);
        System.out.printf("Üçgenin alanı: %d\n", alan);
        System.out.printf("Üçgenin cevresi: %d", cevre);


    }
}
