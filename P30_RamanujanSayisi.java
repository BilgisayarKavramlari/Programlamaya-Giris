import java.util.Scanner;

public class P30_RamanujanSayisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayiyi giriniz : ");
		int a = input.nextInt();
		System.out.print("2. sayiyi giriniz : ");
		int b = input.nextInt();
		System.out.print("3. sayiyi giriniz : ");
		int c = input.nextInt();
		System.out.print("4. sayiyi giriniz : ");
		int d = input.nextInt();
		int aK = (int) Math.pow(a, 3);
		int bK = (int) Math.pow(b, 3);
		int cK = (int) Math.pow(c, 3);
		int dK = (int) Math.pow(d, 3);
		if(aK + bK == cK + dK || aK + cK == bK + dK || aK + dK == bK + cK) {
			System.out.println("ramanujan sayisidir");
		}else {
			System.out.println("ramanujan sayisi degildir");
		}
		
		
		input.close();
	}
}
