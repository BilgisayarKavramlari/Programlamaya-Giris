import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
        System.out.print("Fibonacci dizisinin boyutunu giriniz: ");
        Scanner boyutGir = new Scanner(System.in);
        int n = boyutGir.nextInt();
        int fib[] = new int[n];
        fib[0]=1;
        fib[1]=1;
        for(int i=0;i<n-2;i++){ //hesaplama dongusu
            fib[i+2] = fib[i+1]+fib[i];
        }
        for(int i=0;i<n;i++){ //bastirma dongusu
            System.out.println(fib[i]);
        }
      }
    }  
