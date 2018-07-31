import java.util.Scanner;

public class P21_OgrenciNumarasiOkuma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ogrenci numaranizi giriniz : ");
		int numara = input.nextInt();
		System.out.println("Ogrenci numaraniz : " + numara);
		input.close();
	}
}
