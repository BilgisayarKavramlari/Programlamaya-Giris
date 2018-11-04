	public static void main(String[] args) {
		int a=1;
		int b=1;
		Scanner giris=new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int sayi=giris.nextInt();
		System.out.println("1");
		System.out.println("1");
		
		for(int i=1;i<sayi-1;i++) {
			
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		
			}
		
		
}
