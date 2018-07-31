import java.util.Scanner;

public class P4_BasitIslemler {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("Toplam" + (x + y));
		System.out.println("Cikarma" + (x - y));
		System.out.println("Carpma" + (x * y));
		System.out.println("Bolme" + (x / y));
		
		input.close();
	} 
}
