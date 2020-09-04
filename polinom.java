import java.util.Scanner;

public class PolinomCözümü{

	public static void main(String[] args) {
		Scanner sayi = new Scanner(System.in);
		System.out.println("bir a sayisi giriniz");
		int a = sayi.nextInt();
		System.out.println("bir b sayisi giriniz");
		int b = sayi.nextInt();
		System.out.println("bir c sayisi giriniz");
		int c = sayi.nextInt();
		System.out.println("a nin karesi + b nin karesi + c nin 3 kati : " + ((a*a)+(b*b)+(3*c)));

	}

}
