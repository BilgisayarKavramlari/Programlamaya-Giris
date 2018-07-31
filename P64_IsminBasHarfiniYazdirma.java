import java.util.Scanner;

public class P64_IsminBasHarfiniYazdirma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ilk ismi giriniz : ");
		String a = input.nextLine();
		System.out.print("Ikinci ismi giriniz : ");
		String b = input.nextLine();
		System.out.println(a.charAt(0) + "" + b.charAt(0));
		input.close();
	}
}
