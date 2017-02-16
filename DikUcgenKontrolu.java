import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/15/17.
 */
public class DikUcgenKontrolu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("birinci kenarı giriniz: ");
        int birinciKenar = sc.nextInt();
        System.out.printf("ikinci kenarı giriniz: ");
        int ikinciKenar = sc.nextInt();
        System.out.printf("üçüncü kenarı giriniz: ");
        int ucuncuKenar = sc.nextInt();
        int temp = (int) Math.pow(ucuncuKenar, 2);
        int temp2 = (int) (Math.pow(birinciKenar, 2) + Math.pow(ikinciKenar, 2));

        if (temp == temp2) {
            System.out.printf("Bu bir dik üçgendir");
        } else
            System.out.printf("Bu bir dik üçgen DEGILDIR.");


    }
}
