
import java.util.ArrayList;
import java.util.Scanner;

public class P22_HavuzProblemleri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.print("Kac musluk calistiracaksiniz : ");
		int calisan = input.nextInt();
		for (int i = 1; i < calisan+1; i++) {
			System.out.print(i + "." + " musluk havuzu kac saatte doldurmaktadir? : ");
			int total = input.nextInt();
			ar.add(total);
		}
		double x = 0.0;
		for (int j = 0; j < calisan; j++) {

			x = x + (1 / (double) ar.get(j));

		}
		double y = (1 / x);
		System.out.println(y);
		input.close();
	}
}
