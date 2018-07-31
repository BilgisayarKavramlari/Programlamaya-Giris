import java.util.Scanner;

public class P7_1_DikUcgenKontrolu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci kenari giriniz : ");
		int x = input.nextInt();
		System.out.print("Ikinci kenari giriniz : ");
		int y = input.nextInt();
		System.out.print("Ucuncu kenari giriniz : ");
		int z = input.nextInt();
		if ((int) Math.sqrt((x * x) + (y * y)) == (int) z || (int) Math.sqrt((x * x) + (z * z)) == (int) y
				|| (int) Math.sqrt((y * y) + (z * z)) == (int) x) {
			System.out.println("Girdiginiz ucgen dik ucgendir");
		} else {
			System.out.println("Girdiginiz ucgen dik ucgen degildir");
		}
		input.close();
	}
}
