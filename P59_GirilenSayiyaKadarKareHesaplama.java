import java.util.Scanner;

public class P59_GirilenSayiyaKadarKareHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1'den buyuk bir sayi giriniz : ");
		int sayi = input.nextInt();
		int sonuc = 0;
		for (int i = 0; i < sayi; i++) {
			sonuc += (int) Math.pow((i + 1), 2);
		}
		System.out.println(sonuc);
		input.close();
	}
}
