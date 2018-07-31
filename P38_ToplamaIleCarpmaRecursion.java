import java.util.Scanner;

public class P38_ToplamaIleCarpmaRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ilk sayinizi giriniz : ");
		int f = input.nextInt();
		System.out.print("Ikinci sayinizi giriniz : ");
		int s = input.nextInt();
		System.out.println(recursion(f,s));
		input.close();
	}

	public static int recursion(int a, int b) {
		int sonuc = 0;
		sonuc += a;
		if(b==1) {
			return sonuc;
		}
		return sonuc + recursion(a, b-1);
	}
}
