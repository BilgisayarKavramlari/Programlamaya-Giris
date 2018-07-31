import java.util.ArrayList;
import java.util.Scanner;

public class P43_DizidekiGeometrikOrtalama {

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
		int sonuc = 1;
		for (int j = 0; j < el; j++) {
			sonuc *= ar.get(j);
		}
		int ters = 1 / el;
		System.out.println("Dizinin geometrik ortalamasi : " +  Math.pow(sonuc, ters));
		input.close();
	}
}
