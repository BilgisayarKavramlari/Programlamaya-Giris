import java.util.Scanner;

public class İsciProblemleri {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("isci sayisi giriniz");
		int isci1 = key.nextInt();
		if (isci1<0){
			for(int i = 1 ; i>0 ; i++){
				Scanner key2 = new Scanner(System.in);
				System.out.println("negatif deger girilemez tekrar isci sayisi giriniz");
				isci1 = key2.nextInt();
				if(!(isci1<0))
					break;
			}
		}
		System.out.println("bu isciler isi kac günde bitiriyor?");
		int gün1 = key.nextInt();
		if (gün1<0){
			for(int i = 1 ; i>0 ; i++){
				Scanner key3 = new Scanner(System.in);
				System.out.println("negatif deger girilemez tekrar gün sayisi giriniz");
				gün1 = key3.nextInt();
				if(!(gün1<0))
					break;
			}
		}
		System.out.println("x iscinin isi kaç günde bitirecegini görmek icin bir x degeri giriniz");
		int isci2 = key.nextInt();
		if (isci2<0){
			for(int i = 1 ; i>0 ; i++){
				Scanner key1 = new Scanner(System.in);
				System.out.println("negatif deger girilemez tekrar isci sayisi giriniz");
				isci2 = key1.nextInt();
				if(!(isci2<0))
					break;
			}
		}
		double gün2 = ((double)gün1*(double)isci1)/(double)isci2;
		System.out.println(isci1 + " isci " + gün1 + " günde bitiriyosa " + isci2 + " isci " + gün2 + " günde bitirir");
	}

}
