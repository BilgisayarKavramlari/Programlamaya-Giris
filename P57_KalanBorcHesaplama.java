public class P57_KalanBorcHesaplama {

	public static void main(String[] args) {

		double araba = 581.200;
		double faiz = (araba * 9 * 3) / 100;
		double toplam = araba + faiz;
		System.out.println(toplam);
		double aylik = (toplam / 36);
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1) + ". aylik odemeden sonra kalan borcunuz : " + (toplam - aylik * (i + 1)));
		}
	}
}
