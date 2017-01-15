import java.util.Scanner;

public class YolHizProblemiHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Mesafeyi Giriniz :");
        int mesafe = sc.nextInt();
        System.out.printf("Hizi Giriniz :");
        int hiz = sc.nextInt();
        int sure = mesafe / hiz;
        System.out.printf("Sure %d saattir :", sure);
    }
}
