public static void main(String[] args) {
		{
	        int a,b,i,max,min,Ebob=1,Ekok=1;
	        Scanner Klavye = new Scanner(System.in);//Kalvyeden değer alan java nesnesi
	        System.out.println("EBOB ve EKOK hesabı için iki değer giriniz.");
	        System.out.print("İlk değeri giriniz = ");
	        a = Klavye.nextInt();
	        System.out.print("İkinci değeri giriniz = ");
	        b = Klavye.nextInt();
	 
	       max=(a>b) ? a:b;
	       min=(a>b) ? b:a;
	 
	        for(i=max;i>=1;i--)
	        {
	            if((min%i==0)&&(max%i==0))
	            {
	                Ebob = Ebob * i; break;
	            }
	           
	        }
	        System.out.println("EBOB = "+Ebob+" EKOK = "+ ((a*b)/Ebob));
	    }
	
