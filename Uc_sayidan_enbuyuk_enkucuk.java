          Scanner giris= new Scanner(System.in);
	        System.out.printf(" 1.sayı giriniz: \n");
	        double sayi_1= giris.nextInt();
	        System.out.printf(" 2. sayı giriniz: \n");
	        double sayi_2= giris.nextInt();
	        System.out.printf(" 3. sayı giriniz: \n");
	        double sayi_3= giris.nextInt();
	        
	        if (sayi_1>sayi_2 && sayi_1>sayi_3) System.out.printf("En büyük sayı:%.0f ",sayi_1);
	        else if (sayi_2>sayi_1 && sayi_2>sayi_3) System.out.printf("En büyük sayı:%.0f ", sayi_2);
	        else if (sayi_3>sayi_1 && sayi_3>sayi_2) System.out.printf("En büyük sayı:%.0f ", sayi_3);
	        else System.out.printf("Sayılar eşittir.");
	        
	        if (sayi_1<sayi_2 && sayi_1<sayi_3) System.out.printf("En küçük sayı:%.0f ",sayi_1);
	        else if (sayi_2<sayi_1 && sayi_2<sayi_3) System.out.printf("En küçük sayı:%.0f ", sayi_2);
	        else if (sayi_3<sayi_1 && sayi_3<sayi_2) System.out.printf("En küçük sayı:%.0f ", sayi_3);
	        else System.out.printf("Sayılar eşittir.");
