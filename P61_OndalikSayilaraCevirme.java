import java.util.Scanner;

public class P61_OndalikSayilaraCevirme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen binary sayinizi giriniz :");
		String binary = input.nextLine();
		System.out.println("10'luk tabanda sayiniz : " + Integer.parseInt(binary,2));
		input.close();
	}
}
