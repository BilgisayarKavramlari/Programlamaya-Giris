import java.util.Scanner;

public class P15_1_YildizlarlaUcgen {

	public static void main(String[] args) {
		System.out.print("Lutfen bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		for (int i = 0; i < sayi; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
