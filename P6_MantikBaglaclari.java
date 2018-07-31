import java.util.Scanner;

public class P6_MantikBaglaclari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		// eger(if) kullarak benden istenen kosullari uyguluyorum.
		if (x < y || x > z) {
			System.out.println("x, y ile z arasinda bir sayi degildir");
		}
		if (x < y && x < z) {
			System.out.println("x , y veya z'den daha buyuk degildir");
		}
		if (x == y && x < z) {
			System.out.println("x, y'ye esit ve ayni zamanda z'den kucuktur");
		}
		if (x != y && y != z) {
			System.out.println("uc sayi birbirine esit degildir");
		}
		
		input.close();
	}
	
	
}
