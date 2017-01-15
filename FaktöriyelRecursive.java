
import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/15/17.
 */
public class FaktöriyelRecursive {

    public static int sum = 1;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner read = new Scanner(System.in);

        System.out.printf("Bir sayi giriniz: ");
        int n = read.nextInt();

        System.out.println("Faktöriyeli: " + factorial(n));


    }

    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
