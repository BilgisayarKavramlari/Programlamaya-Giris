
import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen fibonacci serisinin uzunlugunu giriniz: ");
		int i = scan.nextInt();
		int a = 3;
		int x = 1;
		int y = 1;
		int z = x + y;
		int list[] = new int [i];
		
		if (i <= 3) {
			if (i == 1) {
				list[0] = x;
				System.out.println(Arrays.toString(list));
			}
			if (i == 2) {
				list[0] = x;
				list[1] = y;
				System.out.println(Arrays.toString(list));
			}
			if (i == 3) {
				list[0] = x;
				list[1] = y;
				list[2] = z;
				System.out.println(Arrays.toString(list));
			}
		}else {
			list[0] = x;
			list[1] = y;
			list[2] = z;
			
			while (a < i) {
				// 1 1 2 3 5 8 13 21 ....
				// x y z
				// 1 1 2 3 5 8 13 21 ....
				//   x y z
				// 1 1 2 3 5 8 13 21 ....
				//     x y z	
				x = y;
				y = z;
				z = x + y;
				list[a] = z;
				a++;
			}
			System.out.println(Arrays.toString(list));
		}	
	}
}
