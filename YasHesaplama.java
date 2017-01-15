import java.util.Scanner;

public class YasHesaplama {
    public static void main(String[]args){

        Scanner read = new Scanner(System.in);
        System.out.printf("Bugünün tarihi: ");
        int bugunkuTarih= read.nextInt();
        System.out.printf("Doğum Gününüz: ");
        int dogumTarihi= read.nextInt();
        int yas = bugunkuTarih-dogumTarihi;
        System.out.printf("Yaşınız: %d",yas);
    }
}
