import java.util.Scanner;

public class P24_AylikMesai {

	public static void main(String[] args) {
		// Projede eksik bilgi verilmis ornek ekran ciktisina gore mesai saat basi 4 tl
		Scanner input = new Scanner(System.in);
		System.out.print("Mesaiye kaldiginiz toplam saati giriniz : ");
		int saat = input.nextInt();
		System.out.println("Mesai Ucreti : " + saat * 4 + "tl");
		input.close();
	}
}
