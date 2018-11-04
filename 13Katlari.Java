public static void main(String[] args) {
		//100-0 arası 13 ile tam bölünebilen sayılar örneği
		for (int i = 100; i > 0; i--) {
			int kalan= i % 13;
			if(kalan==0)
			{
				System.out.println(i);
			}
			
		}
