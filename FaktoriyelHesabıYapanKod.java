import java.util.Scanner;

 public class FaktorielHesabi {
     
	 
	 public static int Faktoriel_Al(int sayi) {
		int sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc = sonuc * i;
		}
		return sonuc;
	}

	public static void main(String args[]) {
		Scanner deger = new Scanner(System.in);
		int girilenSayi,sonuc;
		System.out.println("Lütfen bir sayı giriniz...:");
		girilenSayi = deger.nextInt();
		if (girilenSayi < 0) {
			System.out.println("negatif sayıların faktöriyeli alınamaz...!!!");
		} else if (girilenSayi == 0) {
			System.out.println("sonuc = 0");
		} else {
			sonuc = Faktoriel_Al(girilenSayi);

			System.out.println("sonuc="+sonuc);

		}

	}
}
