import java.util.Scanner;

public class P31_BinaryCevirici {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen binary sayinizi giriniz :");
		int sayi = input.nextInt();

		int decimal = 0, kat = 0;

		while (sayi != 0) {
			decimal += ((sayi % 10) * Math.pow(2, kat));
			sayi = sayi / 10;
			kat++;
		}
		System.out.println(decimal);
		input.close();
	}
}
