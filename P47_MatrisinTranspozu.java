Cozum 1 : ---------------------------------------------------------------------------------------------------------------------------

public class P47_MatrisinTranspozu {

	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int temp = ar[i][j];
				b[i][j] = ar[j][i];
				b[j][i] = temp;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}
}

Cozum 2 : ---------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class P47_MatrisinTranspozu {
	
	public static int[][] transpoz(int [][] matris, int satir, int sutun){
		int b[][] = new int[sutun][satir];
		for (int i = 0; i<sutun; i++) {
			for (int j = 0;j<satir;j++) {
				b[i][j] = matris[j][i];
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Matrisin satir sayisini giriniz : ");
		int satir = input.nextInt();
		System.out.print("Matrisin sutun sayisini giriniz : ");
		int sutun = input.nextInt();
		
		int a[][] = new int[satir][sutun];
		
		for (int i =0;i<satir;i++) {
			for (int j=0;j<sutun;j++) {
				a[i][j]= (int) (Math.random()*10);
			}
		}
		
		System.out.println("Rastgele olusan matris : ");
		
		for (int i =0; i <satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matrisin Tranpozu : ");
		
		for(int i =0;i<transpoz(a,satir,sutun).length;i++) {
			for(int j=0;j<transpoz(a,satir,sutun)[0].length;j++) {
				System.out.print(transpoz(a,satir,sutun)[i][j] + " ");
			}
			System.out.println("");
		}
		input.close();
	}
}
