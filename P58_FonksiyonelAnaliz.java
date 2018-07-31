import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P58_FonksiyonelAnaliz {

	public static void main(String[] args) {
		HashMap<Integer, String> telefon = new HashMap<Integer, String>();
		telefon.put(2, "ABC");
		telefon.put(3, "DEF");
		telefon.put(4, "GHI");
		telefon.put(5, "JKL");
		telefon.put(6, "MNO");
		telefon.put(7, "PRS");
		telefon.put(8, "TUV");
		telefon.put(9, "WXY");

		Scanner input = new Scanner(System.in);
		System.out.print("2'den 9'a kadar bir sayi giriniz : ");
		int sayi = input.nextInt();
		System.out.println(telefon.get(sayi));
		input.close();
	}
}
