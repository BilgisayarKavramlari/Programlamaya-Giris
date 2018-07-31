import java.util.InputMismatchException;
import java.util.Scanner;

public class P8_HarfNotu {

	public static void main(String[] args) {
		// Not araligi 0 ile 100 arasi oldugundan kullanicinin baska sayilar girmesini engellememiz gerekir.
		while (true) {
			try {
				System.out.print("Lutfen notunuzu giriniz : ");
				Scanner input = new Scanner(System.in);
				int not = input.nextInt();
				if (not < 0 || not > 100) {
					System.out.println("Hatali giris yaptiniz.(Not 0 ile 100 arasinda olmalidir)");
					continue;
				}

				if (not >= 90 && not <= 100) {
					System.out.println("Harf notunuz : AA");
				} else if (not >= 80 && not <= 89) {
					System.out.println("Harf notunuz : BB");
				} else if (not >= 70 && not <= 79) {
					System.out.println("Harf notunuz : CC");
				} else {
					System.out.println("Harf notunuz : FF");
				}

			} catch (InputMismatchException ex) {
				System.out.print("Lutfen 0 ile 100 arasinda bir not giriniz : \n");

			}

		}
	}
}
