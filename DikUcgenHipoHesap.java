	public static void main(String[] args) {
		// Created by Volkan Yıldırım on 11/04/2018
		// Dik üçgen hipotenüs hesabı
		
		  	Scanner giris= new Scanner(System.in);
	        System.out.printf("Dik üçgenin 1. kenarını giriniz: \n");
	        double kenar_1= giris.nextInt();
	        System.out.printf("Dik üçgenin 2. kenarını giriniz: \n");
	        double kenar_2= giris.nextInt();
	        double h=(kenar_1*kenar_1) + (kenar_2*kenar_2);
	        double hipo = Math.sqrt(h);
	        System.out.printf("Hipotenüs: %.2f .",hipo);

	}
