import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/15/17.
 */
public class IkinciDerecedenPolinom {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.printf("a sayısını giriniz: ");
        int a = read.nextInt();
        System.out.printf("b sayısını giriniz: ");
        int b = read.nextInt();
        System.out.printf("c sayısını giriniz: ");
        int c = read.nextInt();
        int sonuc = (int) (Math.pow(a, 2) + Math.pow(b, 2)) + 3 * c;
        System.out.printf("sonuç: %d",sonuc);
    }
}
