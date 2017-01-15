
import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/15/17.
 */
public class isciProblemiCozenKod {

    public static void main(String [] args){
        Scanner read= new Scanner(System.in);
        System.out.printf("Bir işçi işi kaç günde bitirmektedir? \n");
        int isiBitirmeSuresi= read.nextInt();
        System.out.printf("Toplam kaç işçi çalışacak? \n");
        int isciSayisi = read.nextInt();
        int isinBitmeSuresi = isiBitirmeSuresi/isciSayisi;
        System.out.printf("İşin bitme süresi %d gündür",isinBitmeSuresi);

    }
}
