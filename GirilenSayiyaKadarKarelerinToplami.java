import java.util.Scanner;
/*
 * Created by yascan
 */
public class girilensayiyakadarkaretoplami {

	public static void main(String args[]){
  
		Scanner a = new Scanner(System.in);
		System.out.println("Pozitif bir sayı giriniz: ");
		int sayi=a.nextInt();
		int kare,sonuc=0;
		if(sayi>=1){
			for(int i=1;i<=sayi;i++){
				kare=i*i;
				sonuc=sonuc+kare;
			}
		System.out.println("Kareler Toplamı: "+sonuc);
		}
		else{
			System.out.print("Pozitif bir tam sayı giriniz.");
		}
	}

}
