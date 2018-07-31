import java.util.ArrayList;
import java.util.Scanner;

public class P36_AsalDongu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("Kac elementli asal sayi dizisi istiyorsunuz?");
		int sayi = input.nextInt();
		System.out.println("Kacinci siradaki asal sayiyi istiyorsunuz?");
		int dizi = input.nextInt();
		int count = 0;
		int num = 2;
		while (count != sayi) {
			boolean asal = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					asal = false;
					break;
				}
			}
			if (asal) {
				count++;
				ar.add(num);
			}
			num++;
		}
		System.out.println(dizi + ". siradaki asal sayi : " + ar.get(dizi));
		input.close();
	}
}
