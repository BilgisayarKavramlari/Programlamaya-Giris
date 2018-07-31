import java.util.ArrayList;
import java.util.Scanner;

public class P40_DizidekiEnBuyuk3Sayi {

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
		int temp;
		for (int j = 0; j < el; j++) {
			boolean flag = true;
			for (int k = el - 1; k > j; k--) {
				if (ar.get(k - 1) > ar.get(k)) {
					flag = false;
					temp = ar.get(k - 1);
					ar.set(k - 1, ar.get(k));
					ar.set(k, temp);
				}
			}
			if (flag) {
				break;
			}
		}
		input.close();
		System.out.println(ar);
		System.out.println("En buyuk 3 sayinin toplami : " + ar.get(el - 1) + ar.get(el - 2) + ar.get(el - 3));
	}
}
