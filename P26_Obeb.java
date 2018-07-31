import java.util.Scanner;

public class P26_Obeb {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayiyi giriniz : ");
		int x = input.nextInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		int y = input.nextInt();
		int say;
		int sonuc;
		if (x > y) {
			say = x;
		} else {
			say = y;
		}
		while (true) {
			if ((x % say == 0) && (y % say == 0)) {
				sonuc = say;
				break;
			}
			say--;
		}
		System.out.println(say);
		input.close();
	}
}
