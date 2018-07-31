import java.util.Scanner;

public class P37_ToplamaIleCarpma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ilk sayinizi giriniz : ");
		int f = input.nextInt();
		System.out.print("Ikinci sayinizi giriniz : ");
		int s = input.nextInt();
		int sonuc = 0;
			for (int j = 0; j < s; j++) {
				sonuc += f;
			}

		System.out.println(sonuc);
		input.close();
	}
}
