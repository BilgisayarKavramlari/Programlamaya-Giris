import java.util.Scanner;

public class P12_Fibonacci {

	public int fibonacci() {
		return 1;
	}

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13
		System.out.println("Bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int a = 0;
		int b = 1;
		int c;
		// a,b,c
		for (int i = 0; i < sayi; i++) {
			
			c = (a + b);
			a = b;
			b = c;
			System.out.print(a + " ");
		}
		input.close();
	}
}
