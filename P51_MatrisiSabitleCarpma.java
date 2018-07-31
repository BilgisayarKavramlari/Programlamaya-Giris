import java.util.Scanner;

public class P51_MatrisiSabitleCarpma {

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
		
		System.out.print("Matrisi carpmak istediginiz sayiyi giriniz : ");
		int sayi = input.nextInt();
		
		for (int i =0; i <satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.print(a[i][j] * sayi + " ");
			}
			System.out.println(" ");
		}
		
		input.close();
	}
}
