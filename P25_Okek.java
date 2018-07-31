
import java.util.Scanner;

public class P25_Okek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayiyi giriniz : ");
		int x = input.nextInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		int y = input.nextInt();
		int say = 2;
		int sonuc;
		while (true) {
			if ((say % x == 0) && (say % y == 0)) {
				sonuc = say;
				break;
			}
			say++;
		}
		System.out.println(sonuc);
		input.close();
	}
}
