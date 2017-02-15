import java.util.Scanner;

public class İkiTarihArasiGünHesaplama {

	public static void main(String[] args) {
		Scanner key1 = new Scanner(System.in);
		System.out.println("ilk günü giriniz");
		int gün1 = key1.nextInt();
		if(gün1<=0 || gün1>=32){
			System.out.println("1 ile 31 arasında olmalıdır");
			for(int sonsuz = 1 ; sonsuz>0 ; sonsuz++){
			Scanner key2 = new Scanner(System.in);
			System.out.println("tekrardan ilk günü giriniz");
			gün1 = key2.nextInt();
				if(!(gün1<=0 || gün1>=32))
					break;
			}
		}
		System.out.println("ilk ayi giriniz");
		int ay1 = key1.nextInt();
		if(ay1<=0 || ay1>=13){
			System.out.println("1 ile 12 arasında olmalıdır");
			for(int sonsuz = 1 ; sonsuz>0 ; sonsuz++){
			Scanner key2 = new Scanner(System.in);
			System.out.println("tekrardan ilk ayi giriniz");
			ay1 = key2.nextInt();
				if(!(ay1<=0 || ay1>=13))
					break;
			}
		}
		System.out.println("ilk yili giriniz");
		int yil1 = key1.nextInt();
	  Scanner key = new Scanner(System.in);
		System.out.println("ikinci günü giriniz");
		int gün2 = key.nextInt();
		if(gün2<=0 || gün2>=32){
			System.out.println("1 ile 31 arasında olmalıdır");
			for(int sonsuz = 1 ; sonsuz>0 ; sonsuz++){
			Scanner key3 = new Scanner(System.in);
			System.out.println("tekrardan ikinci günü giriniz");
			gün2 = key3.nextInt();
				if(!(gün2<=0 || gün2>=32))
					break;
			}
		}
		System.out.println("ikinci ayi giriniz");
		int ay2 = key.nextInt();
		if(ay2<=0 || ay2>=13){
			System.out.println("1 ile 12 arasında olmalıdır");
			for(int sonsuz = 1 ; sonsuz>0 ; sonsuz++){
			Scanner key2 = new Scanner(System.in);
			System.out.println("tekrardan ikinci ayi giriniz");
			ay2 = key2.nextInt();
				if(!(ay2<=0 || ay2>=13))
					break;
			}
		}
		System.out.println("ikinci yili giriniz");
		int yil2 = key.nextInt();
		System.out.print(gün1 + ".");
		System.out.print(ay1 + ".");
		System.out.println(yil1);
		System.out.print(gün2 + ".");
		System.out.print(ay2 + ".");
		System.out.println(yil2);
		int tarih1 = gün1 + (ay1-1)*30 + (yil1-1)*365 + yil1/4;
		int tarih2 = gün2 + (ay2-1)*30 + (yil2-1)*365 + yil2/4;
		int cikti = tarih2-tarih1;
		if (cikti<0)
			cikti = cikti*-1;
		System.out.println("İki tarih arasındaki gün sayisi : " + cikti);

	}

}
