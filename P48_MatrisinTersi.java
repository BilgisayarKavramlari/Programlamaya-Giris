import java.util.Scanner;

public class P48_MatrisinTersi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Matrisin satir sayisini giriniz : ");
		int satir = input.nextInt();
		System.out.print("Matrisin sutun sayisini giriniz : ");
		int sutun = input.nextInt();

		int a[][] = new int[satir][sutun];

		// Rastgele matris olusturuyoruz
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}

		int b[][] = {
				{ a[1][1] * a[2][2] - a[1][2] * a[2][1], a[0][2] * a[2][1] - a[0][1] * a[2][2],
						a[0][1] * a[1][2] - a[0][2] * a[1][1] },
				{ a[1][2] * a[2][0] - a[1][0] * a[2][2], a[0][0] * a[2][2] - a[0][2] * a[2][0],
						a[0][2] * a[1][0] - a[0][0] * a[1][2] },
				{ a[1][0] * a[2][1] - a[1][1] * a[2][0], a[0][2] * a[2][0] - a[0][0] * a[2][1],
						a[0][0] * a[1][1] - a[0][1] * a[1][0] } };

		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
		input.close();
	}
}
