public class Fibonacci {
	// f(8) = f(7) + f(6)...
	public static int fibo(int n) {
		if(n<=1) return 1;
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		
		System.out.print(fibo(8));
		
		System.out.println("\n");
		
		System.out.println("With Array");
		// [{0}=1, {1}=1, {2}={0}+{1}, {3}={1}+{2}]
		
		int fib[] = new int[10];
		fib[0]=1;
		fib[1]=1;
		for(int i=0;i<8;i++) {
			fib[i+2]=fib[i+1]+fib[i];
		}
		for(int i=0;i<10;i++) {
			System.out.print(fib[i]+",");
		}
		System.out.println("\n");
		System.out.println("Without Array");
		// 1 1 2 3 5 8 13
		// a b c
		//   a b c
		//     a b c
		
		int a=1, b=1, c;
		
		System.out.print(a+","+b);
		for(int i=0;i<10;i++) {
			c = a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
	}
}
