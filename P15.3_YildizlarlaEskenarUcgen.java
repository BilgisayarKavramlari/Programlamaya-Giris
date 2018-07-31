import java.util.Scanner;

public class P15_3_YildizlarlaEskenarUcgen {

	public static void main(String[] args) {

		System.out.print("Lutfen bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		for (int i = 0; i < sayi; i++) {
			for (int k = sayi; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = sayi; i >= 0; i--) {
			for (int k = sayi; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
