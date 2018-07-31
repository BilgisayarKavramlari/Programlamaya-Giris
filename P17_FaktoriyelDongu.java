import java.util.Scanner;

public class P17_FaktoriyelDongu {

	public static void main(String[] args) {

		System.out.print("Bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();

		int fact = 1;
		for (int i = 1; i < sayi + 1; i++) {
			fact *= i;
		}
		System.out.println(fact);

		input.close();
	}

}
