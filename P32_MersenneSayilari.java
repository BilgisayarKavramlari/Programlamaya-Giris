import java.util.ArrayList;
import java.util.Scanner;

public class P32_MersenneSayilari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("Kacinci sayiya kadar mersenne sayisi gormek istiyorsunuz? ");
		int sayi = input.nextInt();
		for (int i =1; i<=sayi;i++) {
			int sayac = 0;
			for (int j = i; j>=1; j--) {
				if(i%j ==0) {
					sayac += 1;
				}
			}
			if (sayac ==2) {
				ar.add(i);
			}
		}
		System.out.println(ar.toString());
		for(int k = 0; k<ar.size();k++) {
			System.out.println("n = " + ar.get(k) + " icin " + ((int) Math.pow(2, ar.get(k)) - 1));
		}
		input.close();
	}

}
