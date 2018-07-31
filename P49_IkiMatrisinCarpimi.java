public class P49_IkiMatrisinCarpimi {

	Double[][] A = { { 6.00, 3.00 }, { 2.00, 1.00 } };
	Double[][] B = { { -0.500, 1.500 }, { 2.000, -2.0000 } };

	public static Double[][] carpim(Double[][] A, Double[][] B) {

		int aSatir = A.length;
		int aSutun = A[0].length;
		int bSatir = B.length;
		int bSutun = B[0].length;

		if (aSutun != bSatir) {
			throw new IllegalArgumentException("A: Satir : " + aSutun + " ile B : Sutun : " + bSatir + "uyusmuyor.");
		}

		Double[][] C = new Double[aSatir][bSutun];
		for (int i = 0; i < aSatir; i++) {
			for (int j = 0; j < bSutun; j++) {
				C[i][j] = 0.00000;
			}
		}

		for (int i = 0; i < aSatir; i++) {
			for (int j = 0; j < aSutun; j++) {
				for (int k = 0; k < bSutun; k++) {
					C[i][k] += A[i][j] * B[j][k];
				}
			}
		}

		return C;
	}

	public static void main(String[] args) {

		P49_IkiMatrisinCarpimi matris = new P49_IkiMatrisinCarpimi();
		Double[][] sonuc = carpim(matris.A, matris.B);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sonuc[i][j] + " ");
			}
			System.out.println();
		}
	}
}
