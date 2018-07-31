import java.util.ArrayList;
import java.util.Scanner;

public class P27_RMS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kac elemanli dizi istiyorsunuz : ");
		int diziSayi = input.nextInt();
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for (int i = 0; i < diziSayi; i++) {
			System.out.print(i + ". Sayiyi giriniz : ");
			int element = input.nextInt();
			arl.add(element);
		}
		System.out.println();
		System.out.print("Sayilar : " + arl.toString());
		for (int j = 0; j < diziSayi; j++) {
			arl.set(j, (int) Math.pow(arl.get(j), 2));
		}
		System.out.print("\nKareleri : " + arl.toString());
		int sonuc = 0;
		for (int k = 0; k < diziSayi; k++) {
			sonuc += arl.get(k);
		}
		int ort = (sonuc / diziSayi);
		System.out.print("\nOrtalamalari : " + ort);
		System.out.println("\nKarekoku : " + Math.sqrt(ort));
		input.close();
	}
}
