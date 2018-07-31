import java.util.Scanner;

class P19_Kombinasyon {

	public static void main(String[] args) {

		System.out.println("-1 girerek programi sonlandirabilirsiniz");
		while (true) {
			System.out.print("Ilk sayiyi giriniz : ");
			Scanner input = new Scanner(System.in);
			int sayi = input.nextInt();
			if (sayi == -1) {
				break;
			}
			System.out.print("Ikinci sayiyi giriniz : ");
			int sayi2 = input.nextInt();
			if (sayi < sayi2) {
				System.out.println("Girilen ilk sayi ikincisinden buyuk olmak zorundadir!");
				continue;
			}

			// C(n,r) = n! / (r!(n-r)!)
			System.out.println(fact(sayi) / (fact(sayi2) * fact((sayi - sayi2))));
			input.close();
		}
	}

	static int fact(int j) {

		if (j == 1)
			return 1;

		return fact(j - 1) * j;
	}
}
