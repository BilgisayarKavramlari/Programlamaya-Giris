import java.util.Scanner;

public class P54_DonguSorusu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen birinci sayiyi giriniz : ");
		int a = input.nextInt();
		System.out.print("Lütfen ikinci sayiyi giriniz : ");
		int b = input.nextInt();
		if (a > b) {
			System.out.println("Birinci sayi ikincisinden buyuktur");
		} else {
			System.out.println("Ikinci sayi birincisinden buyuktur");
		}
		if (a % 2 == 1) {
			System.out.println("Ilk girilen sayi tek sayidir : " + a);
		} else if (b % 2 == 1) {
			System.out.println("Ikinci girilen sayi tek sayidir : " + b);
		}
		System.out.println("sayilarin ortalamasi: " + (a + b) / 2);
		input.close();
	}
}
