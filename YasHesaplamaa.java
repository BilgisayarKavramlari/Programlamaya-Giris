import java.util.Scanner;

public class YasHesaplama {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("kaç yılında oldugunuz giriniz");
		int yıl = key.nextInt();
		System.out.println("dogum yılınızı giriniz");
		int yıl2 = key.nextInt();
		
		System.out.println((yıl-yıl2) + " yasindasiniz");

	}

}
