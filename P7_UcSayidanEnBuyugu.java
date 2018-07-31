import java.util.Scanner;

public class P7_UcSayidanEnBuyugu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		if (x > y && y > z) {
			System.out.println("En büyük sayi: " + x);
			System.out.println("En küçük sayi: " + z);
		} else if (x > y && z > y && x > z) {
			System.out.println("En büyük sayi: " + x);
			System.out.println("En küçük sayi: " + y);
		} else if (y > x && x > z) {
			System.out.println("En büyük sayi: " + y);
			System.out.println("En küçük sayi: " + z);
		} else if (y > x && z > x && y > z) {
			System.out.println("En büyük sayi: " + y);
			System.out.println("En küçük sayi: " + x);
		} else if (z > x && x > y) {
			System.out.println("En büyük sayi: " + z);
			System.out.println("En küçük sayi: " + y);
		} else if (z > x && y > x && z > y) {
			System.out.println("En büyük sayi: " + z);
			System.out.println("En küçük sayi: " + x);
		}
		input.close();
	}
}
