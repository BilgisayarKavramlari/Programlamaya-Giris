import java.util.Scanner;

public class P4_2_YasHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bugunun yili : ");
		int dYil = input.nextInt();
		System.out.println("Dogum yili : ");
		int bYil = input.nextInt();
		System.out.println("Yasiniz : " + (bYil - dYil));
		input.close();
	}
}
