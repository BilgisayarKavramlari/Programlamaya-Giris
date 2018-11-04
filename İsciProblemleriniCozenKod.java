public static void main(String[] args) {
		// Created by Volkan Yıldırım on 11/04/2018
		
		
		  Scanner giris= new Scanner(System.in);
	        System.out.printf("Bir işçi işi kaç günde bitirmektedir? \n");
	        double isSuresi= giris.nextInt();
	        System.out.printf("Toplam kaç işçi çalışacak? \n");
	        double isciSayisi = giris.nextInt();
	        double toplamSure = isSuresi/isciSayisi;
	        System.out.printf("İşin bitme süresi %.1f gündür",toplamSure);

	}
