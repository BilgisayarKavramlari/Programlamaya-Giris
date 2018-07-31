import java.util.Scanner;

public class P52_MatrisinDeterminanti {
	// sadece kare matrislerin tersi vardir.
	public int determinant(int[][] matris) {
		int sonuc = 0;
		for (int i = 0; i<matris.length;i++) {
			int temp[][] = new int[matris.length - 1][matris[0].length - 1];
		}
		if(matris.length == 1) {
			sonuc = matris[0][0];
			return sonuc;
		}
		if (matris.length == 2) {
			sonuc = (matris[0][0] * matris[1][1]) - (matris[0][1] * matris[1][0]);
			return sonuc;
		}
		for (int i =0; i <matris.length;i++) {
			int temp[][] = new int[matris.length - 1][matris[0].length - 1];
			
			for(int j=1;j<matris.length;j++) {
				for(int k = 0;k<matris[0].length;k++) {
					
					if(k<i) {
						temp[j-1][k] = matris[j][k];
					}else if (k>i){
						temp[j-1][k-1] = matris[j][k];
					}
				}
			}
			sonuc += matris[0][i] * Math.pow(-1, (int) i) * determinant(temp);
		}
		return sonuc;
	}
	
	public static void main(String[] args) {
		int matrisF[][] = {{5,3,7},{2,4,9},{3,6,4}};
		P52_MatrisinDeterminanti det = new P52_MatrisinDeterminanti();
		int sonuc = det.determinant(matrisF);
		System.out.println(sonuc);
	}
}
