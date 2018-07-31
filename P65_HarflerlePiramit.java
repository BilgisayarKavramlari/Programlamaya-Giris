import java.util.HashMap;
import java.util.Scanner;

public class P65_HarflerlePiramit {

	public static void main(String[] args) {
		HashMap<String, String> harf = new HashMap<String, String>();
		harf.put("1", "A");
		harf.put("2", "B");
		harf.put("3", "C");
		harf.put("4", "D");
		harf.put("5", "E");
		harf.put("6", "F");
		harf.put("7", "G");
		harf.put("8", "H");
		harf.put("9", "I");
		harf.put("10", "J");
		harf.put("11", "K");
		harf.put("12", "L");
		harf.put("13", "M");
		harf.put("14", "N");
		harf.put("15", "O");
		harf.put("16", "P");
		harf.put("17", "Q");
		harf.put("18", "R");
		harf.put("19", "S");
		harf.put("20", "T");
		harf.put("21", "U");
		harf.put("22", "V");
		harf.put("23", "X");
		harf.put("24", "Y");
		harf.put("25", "Z");
		Scanner input = new Scanner(System.in);
		System.out.print("Alfabenin kacinci harfini gireceksiniz : ");
		String sayi = input.nextLine();
		for (int i = 0; i < Integer.parseInt(sayi); i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(harf.get(Integer.toString(j + 1)));
			}
			for (int k = i; k > 0; k--) {
				System.out.print(harf.get(Integer.toString(k)));
			}
			System.out.println();
		}
		input.close();
	}
}
