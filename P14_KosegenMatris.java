import java.util.Scanner;

public class P14_KosegenMatris {

	public static void main(String[] args) {

		System.out.print("Bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		for (int i = 0; i < sayi; i++) {
			for (int j = 0; j < sayi; j++) {
				if (i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		input.close();
	}
}
