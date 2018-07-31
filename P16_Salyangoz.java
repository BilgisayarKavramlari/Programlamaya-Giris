import java.util.Scanner;

public class P16_Salyangoz {

	public static void main(String[] args) {

		int matrisBoyutu;
		System.out.print("Salyangoz matrisi için boyut giriniz : ");
		Scanner input = new Scanner(System.in);
		matrisBoyutu = input.nextInt();

		int[][] matris = new int[matrisBoyutu][matrisBoyutu];

		int yatay = 0, dikey = 0, toplam = 1;

		boolean arttir = true;

		for (int i = 0; i < matrisBoyutu; i++) {
			matris[yatay][dikey] = toplam;
			if (arttir) {
				while (yatay + 1 < matrisBoyutu && matris[yatay + 1][dikey] == 0)
					matris[++yatay][dikey] = ++toplam;

				while (dikey + 1 < matrisBoyutu && matris[yatay][dikey + 1] == 0)
					matris[yatay][++dikey] = ++toplam;
			} else {

				while (yatay > 0 && matris[yatay - 1][dikey] == 0)
					matris[--yatay][dikey] = ++toplam;

				while (dikey > 0 && matris[yatay][dikey - 1] == 0)
					matris[yatay][--dikey] = ++toplam;
			}
			arttir = !arttir;
		}

		for (int satir = 0; satir < matrisBoyutu; satir++) {
			for (int sutun = 0; sutun < matrisBoyutu; sutun++)
				System.out.print(matris[sutun][satir] + "\t");
			System.out.println();
		}
	input.close();
	}
}
