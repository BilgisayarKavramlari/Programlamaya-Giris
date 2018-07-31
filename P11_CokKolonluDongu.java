import java.awt.List;
import java.util.ArrayList;

public class P11_CokKolonluDongu {

	public static void main(String[] args) {

		ArrayList<Integer> colList1 = new ArrayList<Integer>();
		ArrayList<Integer> colList2 = new ArrayList<Integer>();
		ArrayList<Integer> colList3 = new ArrayList<Integer>();
		ArrayList<Integer> colList4 = new ArrayList<Integer>();

		for (int i = 0; i < 99; i++) {
			if ((i + 1) % 15 == 0) {
				colList1.add(i + 1);
			}
		}

		for (int i = 0; i < 30; i++) {
			if ((i + 1) % 5 == 0) {
				colList2.add(i + 1);
			}
		}

		for (int i = 100; i > 49; i--) {
			if ((i) % 10 == 0) {
				colList3.add(i);
			}
		}

		for (int i = 0; i < 6; i++) {
			colList4.add((int) Math.pow(i + 1, 2));
		}

		System.out.println(colList1.toString());
		System.out.println(colList2.toString());
		System.out.println(colList3.toString());
		System.out.println(colList4.toString());

		for (int a = 0; a < 6; a++) {
			System.out.println(colList1.get(a) + " " + colList2.get(a) + " " + colList3.get(a) + " " + colList4.get(a));
		}
	}
}
