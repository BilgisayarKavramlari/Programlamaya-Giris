import java.util.Scanner;

public class P60_KelimeSayisiBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir kelime giriniz : ");
		String kelime = input.nextLine();
		System.out.println(kelime.length());
		input.close();
	}
}
