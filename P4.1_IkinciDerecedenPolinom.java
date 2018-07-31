import java.util.Scanner;

public class P4_1_IkinciDerecedenPolinom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz : ");
		int a = input.nextInt();
		System.out.println("Ikinci sayiyi giriniz : ");
		int b = input.nextInt();
		System.out.println("Ucuncu sayiyi giriniz : ");
		int c = input.nextInt();
		int sonuc = (int) (Math.pow(a, 2) + Math.pow(b, 2) + (3*c));
		// int sonuc = (a*a) + (b*b) + (3*c);
		System.out.println(sonuc);
		
		input.close();
	}
}
