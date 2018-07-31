import java.util.Scanner;

public class P20_EkrandanIsimOkuma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen isminizi giriniz : ");
		String isim = input.nextLine();
		System.out.println("Merhaba " + isim);
		input.close();
	}
}
