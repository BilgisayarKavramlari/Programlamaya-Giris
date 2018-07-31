import java.util.Scanner;

public class P66_IsminHerBiriniBastirma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Isminiz kac kelimeden olusuyor?");
		int sayi = input.nextInt();
		String[] kelime = new String[sayi];
		System.out.println("Isim girme isleminden cikmak icin 0 giriniz!");
		for (int j = 1; j < sayi + 1; j++) {
			System.out.print(j + ". kelimenizi giriniz : ");
			kelime[j-1] = input.next();
			if (kelime[j-1] == "0") {
				break;
			}
		}
		for (int j = 0; j < sayi; j++) {
			System.out.println(kelime[j]);
		}
		for (int j = 0; j < sayi; j++) {
			System.out.print(kelime[j].charAt(0));
		}
		input.close();
	}
}
