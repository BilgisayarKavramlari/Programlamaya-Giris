import java.util.Scanner;

public class P13_CarpimTablosu {

	public static void main(String[] args) {

		System.out.print("Bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		for (int i = 0; i < sayi; i++) {
			System.out.print(
					(i + 1) + " " + (i + 1) * 2 + " " + (i + 1) * 3 + " " + (i + 1) * 4 + " " + (i + 1) * 5 + " \n");
		}

		System.out.print("Bir sayi giriniz : ");
		int sayi2 = input.nextInt();
		for (int x = 0; x < sayi2; x++) {
			for (int y = 1; y < sayi2; y++) {
				System.out.print(((x + 1) * y + " "));
			}
			System.out.print("\n");
		}

		input.close();
	}
}
