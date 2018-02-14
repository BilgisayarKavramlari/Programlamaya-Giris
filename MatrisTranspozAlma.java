import java.util.Scanner;
public class TranspozeAlmaMain {

	public static void main(String[] args) {
		TranspozeAlma transpoze=new TranspozeAlma();		
		int dizi[][]=new int[2][2];
		System.out.println("transpozesini almak istediginiz 2ye 2 boyutunda matrisinizin degerlerini giriniz:");
		System.out.println();
		Scanner input=new Scanner(System.in);
		for(int i=0;i<dizi.length;i++) {
			for(int j=0;j<dizi.length;j++) {
				System.out.printf("dizi[%d][%d]=",i,j);
				dizi[i][j]=input.nextInt();
			}
		}
		int satir=dizi.length;
		int sutun=dizi[0].length;
		int sonucmatris[][]=new int[sutun][satir];
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				sonucmatris[j][i]=dizi[i][j];
			}
		}
		
		System.out.println("\nmatrisinizin transpozesi alinmis hali...\n");
		
		for(int i=0;i<sonucmatris.length;i++) {
			for(int j=0;j<sonucmatris[0].length;j++) {
				System.out.print(" "+sonucmatris[i][j]);
			}
			System.out.println();
		}
		
	}

}
