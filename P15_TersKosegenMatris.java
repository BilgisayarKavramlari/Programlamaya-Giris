import java.util.Scanner;

public class P15_TersKosegenMatris {

	public static void main(String[] args) {
		System.out.print("Bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		for (int i = 0; i < sayi; i++) {
			for (int j = sayi; j > 0; j--) {
				if (i == j - 1) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
				// 0,4 1,3 2,2 3,1 4,0
			}
			System.out.println();
		}
		input.close();
	}
}
