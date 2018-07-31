import java.util.Scanner;

public class P29_Sigmoid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = input.nextInt();
		double func = 1 / (1 + (Math.exp(-sayi)));
		System.out.print("Sigmoid fonksiyonu : " + func);
	}
}
