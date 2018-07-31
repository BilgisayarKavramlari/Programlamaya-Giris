import java.util.ArrayList;
import java.util.Scanner;

public class XP4_4_IsciProblemleri {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.print("Kac isci calistiracaksiniz : ");
		int calisan = input.nextInt();
		for (int i = 1; i < calisan+1; i++) {
			System.out.print(i + "." + " isciniz bir isi kac gunde bitirmektedir? : ");
			int total = input.nextInt();
			ar.add(total);
		}
		double x = 0;
		for (int j = 0; j < calisan; j++) {
			x += (1 / (double) ar.get(j));

		}
		double y = (double) (1 / x);
		System.out.println(y); 
		input.close();
	}
}
