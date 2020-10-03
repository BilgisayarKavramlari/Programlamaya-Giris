import java.util.Scanner;

public class Salyangoz {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Kaca kaclık bir salyangoz tablosu istiyorsunuz:  (Ex: 5)");
			
			int a = scan.nextInt(); //---> Salyangoz tablosunun boyutunu belirliyoruz
			int[][] arr = new int[a][a]; //---> Boyutları girilen tabloyu olusturuyoruz
			
			/*
			 Salyangoz tablosunun matıgını anlamak icin
			 ornek olarak 3 x 3 luk bir tabloya bakalım
			 
			 1 | 2 | 3 | 0.      			(0,0) (1,0) (2,0)
			 8 | 9 | 4 | 1.  ---> oordinat  (0,1) (1,1) (2,1)
			 7 | 6 | 5 | 2.					(0,2) (1,2) (2,2)
			 
			 0.  1.  2. ---> apsis
			 
			 */
			
			// --  Mantık olarak ilk basta apsisi artıracak sonra oordinati artıracak
			// --  Daha sonra ilk once apsisi azaltacak daha sonra oordinatı azaltacagız
			// --  Bunu da dongu biciminde tekrarlayacagız
			
			int apsis = 0; //---> apsis de gezicek olan degisken 
			int oordinat = 0; //---> oordinat da gezicek olan degisken
			int deger = 1; //---> array in icine atanacak  deger
			
			boolean atama = true; //---> array de bir sonraki koordinata gecmek icin kulandıgımız degisken 
			
			for (int i = 0;i < a;i++) {
				
				/*
				 Basta dongu kurmamız gerek demistim eger bu donguyu kurmazsak
				 apsis ve oordinat degerlerini sadece bir kere artırıp azaltırız
				 ama bizim arrayin boyutuna gore bu islemi tekrarlamamız lazım
				 
				 */
				
				arr[apsis][oordinat] = deger; //---> Oncelikle ilk koordinatimiza (0,0) degeri atıyoruz
				
				if (atama) { //---> Burada arrayin disina cikmamak icin kontrol ediyoruz
					
					while (apsis + 1 < a && arr[apsis + 1][oordinat] == 0) {
						/*
						 (apsis + 1 < a) --> Bir sonraki koordinat array in uzunlugunu geciyor mu 
						 diye kontrol ediyoruz aynı zamanda gecmiyorsa icine deger atanmis mi diye
						 arr[apsis + 1][oordinat] == 0 --> kontrol ediyoruz (eger icine deger atanmamıs ise 
						 default deger olarak 0 a esit olacaktır)
						 
						 */
						arr[++apsis][oordinat] = ++deger; //---> Her seyi sagliyorsa icine yeni degerimizi atiyoruz
					}	
					while (oordinat + 1 < a && arr[apsis][oordinat + 1] == 0) {
						/*
						 Yukaridaki islemleri devam ettiriyoruz
						 */
						arr[apsis][++oordinat] = ++deger;
					}
				}
				else {
					/*
					 Simdi yukarida artirma islemlerini yaptık ve array in son noktasina ulastik
					 simdi de azaltma islemlerini yapmamiz gerek
					  
					 */
					while (apsis > 0 && arr[apsis - 1][oordinat] == 0) {
						arr[--apsis][oordinat] = ++deger;
					}
					
					while (oordinat > 0 && arr[apsis][oordinat - 1] == 0) {
						arr[apsis][--oordinat] = ++deger;
					}
					
				}
				atama = !atama; //---> Bu islemi else dongusunun de calismasi icin yapıyoruz
			}
			
			for (int satir = 0; satir < a; satir++){  //--> Burada ekrana yazdirma islemini yapıyoruz
	            for (int sutun = 0; sutun < a; sutun++) {
	                System.out.print(arr[sutun][satir] + "\t"); //--> '\t' aralarina bir tab tusu bosluk birakiyoruz
	            }
	            System.out.println(); //--> Bir sonraki satıra geciyoruz
	        }		
		}
	}
}
