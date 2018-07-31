import java.util.ArrayList;
import java.util.Scanner;

public class P42_DizidekiAritmetikOrtalama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("Kac elementli dizi istiyorsun?");
		int el = input.nextInt();
		for (int i = 0; i < el; i++) {
			System.out.print((i + 1) + ". sayiyi giriniz : ");
			int tmp = input.nextInt();
			ar.add(tmp);
		}
		int sonuc = 0;
		for (int j = 0; j < el; j++) {
			sonuc += ar.get(j);
		}
		System.out.println("Dizinin aritmetik ortalamasi : " + (sonuc / el));
		input.close();
	}

}
