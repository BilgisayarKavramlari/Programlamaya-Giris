import java.util.Scanner;

public class P28_HiperbolikTan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		double x = input.nextDouble();
		double a = Math.exp(x);
		double b = Math.exp(-x);
		System.out.println("Hiperbolik Tanjant : " + (a-b)/(a+b));
		input.close();
	}
}
