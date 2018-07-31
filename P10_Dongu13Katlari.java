public class P10_Dongu13Katlari {

	public static void main(String[] args) {
		for (int i = 100; i > 0; i--) {
			if ((i + 1) % 13 == 0) {
				System.out.println(i + 1);
			}
		}
	}
}
