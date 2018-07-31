import java.util.Scanner;

public class P4_6_DikUcgenHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci dik kenari giriniz : ");
		int kenarF = input.nextInt();
		System.out.print("Ikinci dik kenari giriniz : ");
		int kenarS = input.nextInt();
		int toplam = (kenarF * kenarF) + (kenarS * kenarS);
		System.out.println("Ucgenin alani : " + ((kenarF * kenarS) / 2));
		System.out.println("Ucgenin cevresi : " + (int) (kenarF + kenarS + Math.sqrt(toplam)));
		input.close();
	}
}
