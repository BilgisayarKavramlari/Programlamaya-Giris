import java.util.Scanner;

public class P3_1_EkranaTarihBasma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen yili giriniz : ");
		int yil = input.nextInt();
		System.out.print("Lutfen ayi giriniz : ");
		int ay = input.nextInt();
		System.out.print("Lutfen gunu giriniz : ");
		int gun = input.nextInt();
		System.out.println("GG/AA/YYYY : " + gun + "/" + ay + "/" + yil);
		System.out.println("AA/GG/YYYY : " + ay + "/" + gun + "/" + yil);
		System.out.println("YYYY/AA/GG : " + yil + "/" + ay + "/" + gun);
		input.close();
	}
}
