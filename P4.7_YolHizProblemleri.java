import java.util.Scanner;

public class P4_7_YolHizProblemleri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen mesafeyi giriniz : ");
		double mesafe = input.nextDouble();
		System.out.println("Lutfen hizi giriniz : ");
		double hiz = input.nextDouble();
		System.out.println("Sure : " + (int) (mesafe / hiz));
		input.close();
	}
}
