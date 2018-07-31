import java.util.ArrayList;
import java.util.Scanner;

public class P33_Ilk20AsalSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("Kacinci sayiya kadar mersenne sayisi gormek istiyorsunuz? ");
		int sayi = input.nextInt();
		int count = 0;
		int num = 2;
		while (count != sayi) {
			boolean asal = true;
			for (int i = 2; i < Math.sqrt(num); i++) {
				if (num % i == 0) {
					asal = false;
					break;
				}
			}
			if (asal) {
				count++;
				System.out.println(num);
			}
			num++;
		}
		input.close();
	}
}
