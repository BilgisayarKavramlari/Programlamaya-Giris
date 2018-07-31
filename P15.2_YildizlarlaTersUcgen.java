import java.util.Scanner;

public class P15_2_YildizlarlaTersUcgen {

	public static void main(String[] args) {
		System.out.print("Lutfen bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		for (int i = 0; i < sayi; i++) {
			for (int j = sayi; i < j ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
