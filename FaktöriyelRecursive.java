
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

        System.out.println("Faktöriyeli: " + fibonacci(n));


    }

    public static int fibonacci(int n) {

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;

    }
}
